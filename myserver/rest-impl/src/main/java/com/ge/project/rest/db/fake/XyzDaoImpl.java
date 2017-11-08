package com.ge.project.rest.db.fake;

import com.ge.project.rest.db.XyzDao;
import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by i858764 on 8/18/17.
 */
public class XyzDaoImpl implements XyzDao {

    private Map<String, Xyz> _database;

    public XyzDaoImpl() {
        this._database = new HashMap<>();
    }

    @Override
    public Xyz get(XyzKey xyzKey) {
        return _database.get(String.valueOf(xyzKey.getNum1()).concat(String.valueOf(xyzKey.getNum2())));
    }

    @Override
    public void insert(Xyz xyz) {
        _database.put(String.valueOf(xyz.getNum1()).concat(String.valueOf(xyz.getNum2())), xyz);
    }

    @Override
    public void update(XyzKey xyzKey, Xyz xyz) {
        _database.put(String.valueOf(xyzKey.getNum1()).concat(String.valueOf(xyzKey.getNum2())), xyz);
    }

    @Override
    public void delete(XyzKey xyzKey) {
        _database.remove(String.valueOf(xyzKey.getNum1()).concat(String.valueOf(xyzKey.getNum2())));
    }
}
