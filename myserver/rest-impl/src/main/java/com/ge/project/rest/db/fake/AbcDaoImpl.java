//package com.ge.project.rest.db.fake;
//
//import com.ge.project.rest.db.AbcDao;
//import nam.e.spa.ce.Abc;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by i858764 on 8/18/17.
// */
//public class AbcDaoImpl implements AbcDao {
//
//    private Map<String, Abc> _database;
//
//    public AbcDaoImpl() {
//        this._database = new HashMap<>();
//    }
//
//    @Override
//    public Abc get(String longUrl) {
//        return _database.get(longUrl);
//    }
//
//    @Override
//    public Integer insert(Abc abc) {
//        _database.put(abc.getLongUrl(), abc);
//    }
//
//    @Override
//    public void update(String longUrl, Abc abc) {
//        _database.put(longUrl, abc);
//    }
//
//    @Override
//    public void delete(String longUrl) {
//        _database.remove(longUrl);
//    }
//
//}
