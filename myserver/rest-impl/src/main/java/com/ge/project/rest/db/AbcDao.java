package com.ge.project.rest.db;

import nam.e.spa.ce.Abc;

/**
 * Created by i858764 on 8/18/17.
 */
public interface AbcDao {

    Abc get(String longUrl);

    Integer insert(Abc abc);

    void update(String longUrl, Abc abc);

    void delete(String longUrl);
}
