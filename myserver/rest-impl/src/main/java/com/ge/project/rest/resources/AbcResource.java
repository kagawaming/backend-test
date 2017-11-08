package com.ge.project.rest.resources;

import com.ge.project.rest.services.AbcService;
import com.ge.project.rest.services.AbcServiceFactory;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.Action;
import com.linkedin.restli.server.annotations.ActionParam;
import com.linkedin.restli.server.annotations.Finder;
import com.linkedin.restli.server.annotations.QueryParam;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import nam.e.spa.ce.Abc;

import java.util.List;

/**
 * Created by i858764 on 8/18/17.
 */
@RestLiCollection(name = "abc", namespace = "nam.e.spa.ce")
public class AbcResource extends CollectionResourceTemplate<String, Abc> {

    private AbcService _abcService = AbcServiceFactory.createAbcInstance();

    @Override
    public Abc get(String longUrl) {
        return _abcService.get(longUrl);
    }

    @Override
    public CreateResponse create(Abc abc) {
        return _abcService.create(abc);
    }

    @Override
    public UpdateResponse update(String longUrl, Abc abc) {
        return _abcService.update(longUrl, abc);
    }

    @Override
    public UpdateResponse delete(String longUrl) {
        return _abcService.delete(longUrl);
    }

//    @Finder("saturday")
//    public List<Abc> findBySaturday(
//            @QueryParam("firstChar") char firstChar,
//            @QueryParam("secondChar") char secondChar
//    ) {
//        return null;
//    }
//
//    @Action(name = "friday")
//    public void actionFriday(
//            @ActionParam("firstChar") char firstChar,
//            @ActionParam("thirdChar") char thirdChar
//    ) {
//
//    }

}
