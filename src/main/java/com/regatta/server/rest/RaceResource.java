package com.regatta.server.rest;

import org.json.simple.JSONObject;
import org.restlet.Component;
import org.restlet.engine.component.ServerRouter;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

public class RaceResource extends ServerRouter {

    public RaceResource(Component component) {
        super(component);
    }

    @Get
    public JSONObject getVenue(String query) {

        final JSONObject jsonObject = new JSONObject();

        return jsonObject;
    }

    @Post
    public void addCount(String query) {

    }

}
