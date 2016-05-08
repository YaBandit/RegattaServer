package com.regatta.server.pojos;

import com.regatta.server.enums.RaceType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Race {

    private final List<Entry> entries = new ArrayList<>();

    private final RaceType type;

    private final int raceNumber;

    private final Date raceTime;

    private boolean isComplete = false;


    public Race(RaceType type, int raceNumber, Date raceTime) {

        this.type = type;
        this.raceNumber = raceNumber;
        this.raceTime = raceTime;
    }

    @Override
    public String toString() {
        return "Race{" +
                "type=" + type +
                ", entries=" + entries +
                ", raceNumber=" + raceNumber +
                ", raceTime=" + raceTime +
                ", isComplete=" + isComplete +
                '}';
    }

    public RaceType getType() {
        return type;
    }

    public List<Entry> getEntries() {
        return entries;
    }


    public int getRaceNumber() {
        return raceNumber;

    }


    public Date getRaceTime() {
        return raceTime;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }


}
