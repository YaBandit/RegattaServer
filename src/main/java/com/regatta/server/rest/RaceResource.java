package com.regatta.server.rest;

import com.regatta.server.core.RaceManager;
import com.regatta.server.enums.RaceType;
import com.regatta.server.pojos.Race;
import org.json.simple.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import java.util.Date;

public class RaceResource extends ServerResource {

    private final RaceManager raceManager = RaceManager.getInstance();

    @Get
    public JSONObject getRace(String query) {

        final Race tempRace = new Race(RaceType.GENTS_NOVICE_PUNTING, 1, new Date());

        return RaceManager.raceToJson(tempRace);
    }

    @Post
    public void addCount(String query) {

    }

}
