package com.ge.project.rest.db;

import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

/**
 * Created by i858764 on 8/18/17.
 */
public interface XyzDao {
    Xyz get(XyzKey xyzKey);

    void insert(Xyz xyz);

    void update(XyzKey xyzKey, Xyz xyz);

    void delete(XyzKey xyzKey);
}
