package com.ge.project.jettySimulator;

/**
 * Created by i858764 on 8/18/17.
 */

import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.webapp.WebAppContext;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class BackendServer {
    private static final String WEB_APP_PATH =
            BackendServer.class.getClassLoader()
                    .getResource(".").toString()
                    //.replace("out/production/", "myserver/")
                    .replace("build/classes/java/main/", "")
                    + "src/main/webapp";
    private static final String WEB_XML_PATH =
            WEB_APP_PATH + "/WEB-INF/web.xml";
    private static final String CONTEXT_PATH = "/myserver-backend";

    public static void main(String[] args) throws Exception {
        Server server = new Server();

        WebAppContext webApp = new WebAppContext(WEB_APP_PATH, CONTEXT_PATH);
        webApp.setDescriptor(WEB_XML_PATH);
        webApp.setParentLoaderPriority(true);
        server.setHandler(webApp);

        HttpConnectionFactory httpConnectionFactory =
                new HttpConnectionFactory(new HttpConfiguration());
        ServerConnector connector =
                new ServerConnector(server, httpConnectionFactory);
        connector.setHost("0.0.0.0");
        connector.setPort(7077);
        server.addConnector(connector);

        server.start();

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(() -> {
            if (server.isStarted()) {
                WebAppContext context = ((WebAppContext) server.getHandler());
                if (context.isAvailable()) {
                    System.out.println("READY");
                    System.out.println(String.format("Ready on: http://%s:%s%s", "0.0.0.0", "7077", CONTEXT_PATH));
                    System.out.println("\n\n");
                } else {
                    System.out.println("Server started but web app context unavailable. Reason: " + context.getUnavailableException());
                }
                service.shutdownNow();
            }
        }, 0, 100, TimeUnit.MILLISECONDS);

        server.join();
    }
}
