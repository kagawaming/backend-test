package com.ge.project.rest.services;

import com.ge.project.rest.db.fake.XyzDaoImpl;

/**
 * Created by i858764 on 8/19/17.
 */
public class XyzServiceFactory {
    private static XyzService _xyzService;
    private static Object _lock = new Object();

    private XyzServiceFactory() {
    }


    public static XyzService createXyzInstance() {
        if (_xyzService == null) {
            synchronized (_lock) {
                if (_xyzService == null) {
                    _xyzService = new XyzService(new XyzDaoImpl());
                }
            }
        }
        return _xyzService;
    }
}
