package com.ge.project.rest.resources;

import com.ge.project.rest.services.XyzService;
import com.ge.project.rest.services.XyzServiceFactory;
import com.linkedin.restli.common.ComplexResourceKey;
import com.linkedin.restli.common.EmptyRecord;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.ComplexKeyResourceTemplate;
import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

/**
 * Created by i858764 on 8/19/17.
 */
@RestLiCollection(name = "xyz", namespace = "nam.e.spa.ce")
public class XyzResource extends ComplexKeyResourceTemplate<XyzKey, EmptyRecord, Xyz> {

    private XyzService _xyzService = XyzServiceFactory.createXyzInstance();

    @Override
    public Xyz get(ComplexResourceKey<XyzKey, EmptyRecord> complexKey) {
        return _xyzService.get(complexKey.getKey());
    }

    @Override
    public CreateResponse create(Xyz xyz) {
        return _xyzService.create(xyz);
    }

    @Override
    public UpdateResponse update(ComplexResourceKey<XyzKey, EmptyRecord> complexKey, Xyz xyz) {
        return _xyzService.update(complexKey.getKey(), xyz);
    }

    @Override
    public UpdateResponse delete(ComplexResourceKey<XyzKey, EmptyRecord> complexKey) {
        return _xyzService.delete(complexKey.getKey());
    }
}