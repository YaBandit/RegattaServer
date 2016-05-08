package com.regatta.server.enums;

public enum RaceType {

    GENTS_NOVICE_PUNTING("Gents Novice Punting");

    private final String type;

    RaceType(String type) {

        this.type = type;
    }

    public String getType() {
        return type;
    }

}
