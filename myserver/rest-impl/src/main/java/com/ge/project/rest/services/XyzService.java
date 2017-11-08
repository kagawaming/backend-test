package com.ge.project.rest.services;

import com.ge.project.rest.db.XyzDao;
import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

/**
 * Created by i858764 on 8/18/17.
 */
public class XyzService {

    private XyzDao _xyzDao;

    public XyzService(XyzDao xyzDao) {
        _xyzDao = xyzDao;
    }

    public Xyz get(XyzKey xyzKey) {
        Xyz xyz = _xyzDao.get(xyzKey);
        if (xyz == null) {
            xyz = calculateXyz(xyzKey);
        }
        return xyz;
    }

    private Xyz calculateXyz(XyzKey xyzKey) {
        return new Xyz()
                .setNum1(xyzKey.getNum1())
                .setNum2(xyzKey.getNum2())
                .setSum(xyzKey.getNum1() + xyzKey.getNum2());
    }

    public CreateResponse create(Xyz xyz) {
        _xyzDao.insert(xyz);
        return new CreateResponse(HttpStatus.S_201_CREATED);
    }

    public UpdateResponse update(XyzKey xyzKey, Xyz xyz) {
        _xyzDao.update(xyzKey, xyz);
        return new UpdateResponse(HttpStatus.S_200_OK);
    }

    public UpdateResponse delete(XyzKey xyzKey) {
        _xyzDao.delete(xyzKey);
        return new UpdateResponse(HttpStatus.S_200_OK);
    }
}
