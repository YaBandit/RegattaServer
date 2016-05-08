package com.regatta.server.pojos;

import com.regatta.server.enums.RaceType;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final List<Entry> entries = new ArrayList<>();

    private final RaceType type;

    public Race(RaceType type) {

        this.type = type;
    }

    @Override
    public String toString() {

        return type.toString();

    }

    public RaceType getType() {
        return type;
    }

    public List<Entry> getEntries() {
        return entries;
    }


}
