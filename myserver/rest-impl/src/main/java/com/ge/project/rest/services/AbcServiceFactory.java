package com.ge.project.rest.services;

import com.ge.project.rest.db.SQL.DataSourceFactory;
import com.ge.project.rest.db.SQL.AbcDaoImpl;

/**
 * Created by i858764 on 8/19/17.
 */
public class AbcServiceFactory {
    private static AbcService _abcService;
    private static Object _lock = new Object();

    private AbcServiceFactory() {
    }

    public static AbcService createAbcInstance() {
        if (_abcService == null) {
            synchronized (_lock) { // TODO: 确保只有一个线程能执行建立AbcService的操作
                if (_abcService == null) { // TODO:多个排队的线程有可能都要建立AbcService，所以此处要再check一次null
                    _abcService = new AbcService(new AbcDaoImpl(DataSourceFactory.createInstance()));
                }
            }
        }
        return _abcService;
    }
}
