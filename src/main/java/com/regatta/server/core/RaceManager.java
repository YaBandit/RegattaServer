package com.regatta.server.core;

import com.regatta.server.pojos.Race;
import org.json.simple.JSONObject;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class RaceManager {

    private static final RaceManager INSTANCE = new RaceManager();

    private RaceManager() {

    }

    public static RaceManager getInstance() {
        return INSTANCE;
    }

    private final Set<Race> races = Collections.newSetFromMap(new ConcurrentHashMap<Race, Boolean>());

    public Race getRace(int raceNumber) {

        return races.stream().filter(r -> r.getRaceNumber() == raceNumber).collect(LambaUtils.singletonCollector());

    }


    public Set<Race> getRaces() {
        return races;
    }

    public static JSONObject raceToJson(Race race) {

        final JSONObject jObj = new JSONObject();

        jObj.put("type", race.getType().toString());
        jObj.put("raceNumber", race.getRaceNumber());
        jObj.put("raceTime", race.getType());
        jObj.put("isComplete", race.isComplete());

        race.getEntries().forEach(e -> {
            jObj.put("Entries", EntryUtils.entryToJson(e));
        });

        return jObj;

    }


}
