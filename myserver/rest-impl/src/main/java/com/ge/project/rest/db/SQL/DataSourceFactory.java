package com.ge.project.rest.db.SQL;

/**
 * Created by mqiu on 8/27/17.
 */

import javax.sql.DataSource;

import com.ge.project.rest.db.SQL.AbcDaoImpl;
import com.ge.project.rest.services.AbcService;
import org.apache.commons.dbcp2.BasicDataSource;

public class DataSourceFactory {
    private static DataSource _dataSource = null;
    private static Object _lock = new Object();

    private DataSourceFactory() {}

    public static DataSource createInstance() {
        if (_dataSource == null) {
            synchronized (_lock) { // TODO: 确保只有一个线程能执行建立AbcService的操作
                if (_dataSource == null) { // TODO:多个排队的线程有可能都要建立AbcService，所以此处要再check一次null
                    BasicDataSource basicDataSource = new BasicDataSource();

                    basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
                    basicDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mingDatabase?serverTimezone=UTC&useSSL=false");
                    basicDataSource.setUsername("root");
                    basicDataSource.setPassword("");

                    _dataSource = basicDataSource;
                }
            }
        }

        return _dataSource;
    }
}
