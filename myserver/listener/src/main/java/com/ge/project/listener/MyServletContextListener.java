package com.ge.project.listener;

import com.ge.project.rest.services.AbcServiceFactory;
import com.ge.project.rest.services.XyzServiceFactory;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by i858764 on 8/19/17.
 */
public class MyServletContextListener implements ServletContextListener {

    ExecutorService executorService = Executors.newSingleThreadExecutor();

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        AbcServiceFactory.createAbcInstance();
        XyzServiceFactory.createXyzInstance();

        String _topic = "test1";
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "DemoConsumer");
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        properties.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "30000");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.IntegerDeserializer");
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "group1");
        KafkaConsumer<Integer, String> _consumer = new KafkaConsumer<>(properties);

        _consumer.subscribe(Collections.singletonList(_topic));

        Properties producerProperties = new Properties();
        producerProperties.put("bootstrap.servers",  "localhost:9092");
        producerProperties.put("client.id", "DemoProducer");
        producerProperties.put("key.serializer", "org.apache.kafka.common.serialization.IntegerSerializer");
        producerProperties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<Integer, String> _producer = new KafkaProducer<>(producerProperties);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            while (true) {
                ConsumerRecords<Integer, String> records = _consumer.poll(2000);
                for (ConsumerRecord<Integer, String> record : records) {
                    System.out.println("topic:" + _topic + "key: " + record.key() + ", value: " + record.value() + ", offset: " + record.offset());

                    _producer.send(new ProducerRecord<>("topicB", record.key(), record.value() + record.value()), new Callback() {
                        @Override
                        public void onCompletion(RecordMetadata metadata, Exception exception) {
                            if (metadata != null) {
                                System.out.println("Yeah: " + "topic: topicB, " + "key: " + record.key() + ", value: " + record.value() + record.value());
                            } else {
                                System.out.println("Failed to send " + "message");
                            }
                        }
                    });

                }
            }
        });
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        executorService.shutdown();
    }
}
