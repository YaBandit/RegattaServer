package com.regatta.server.core;

import com.regatta.server.pojos.Race;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;


public class RaceManager {

    private final Set<Race> races = Collections.newSetFromMap(new ConcurrentHashMap<Race, Boolean>());

    public Race getRace(int raceNumber) {

        return races.stream().filter(r -> r.getRaceNumber() == raceNumber).collect(LambaUtils.singletonCollector());

    }


    public Set<Race> getRaces() {
        return races;
    }

}
