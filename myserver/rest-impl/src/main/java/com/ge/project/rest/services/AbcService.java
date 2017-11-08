package com.ge.project.rest.services;

import com.ge.project.rest.db.AbcDao;
import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import nam.e.spa.ce.Abc;

/**
 * Created by i858764 on 8/18/17.
 */
public class AbcService {

    private AbcDao _abcDao;

    public AbcService(AbcDao abcDao) {
        _abcDao = abcDao;
    }

    public Abc get(String longUrl) {
        Abc abc = _abcDao.get(longUrl);
        if (abc == null) {
            abc = calculateAbc(longUrl);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(abc.getLongUrl() + " -> " + abc.getShortUrl());
        return abc;
    }

    private Abc calculateAbc(String longUrl) {
        return new Abc()
                .setLongUrl(longUrl)
                .setShortUrl(new StringBuilder(longUrl).reverse().toString());
    }

    public CreateResponse create(Abc abc) {
        _abcDao.insert(abc);
        return new CreateResponse(HttpStatus.S_201_CREATED);
    }

    public UpdateResponse update(String longUrl, Abc abc) {
        _abcDao.update(longUrl, abc);
        return new UpdateResponse(HttpStatus.S_200_OK);
    }

    public UpdateResponse delete(String longUrl) {
        _abcDao.delete(longUrl);
        return new UpdateResponse(HttpStatus.S_200_OK);
    }
}
