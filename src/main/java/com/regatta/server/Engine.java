package com.regatta.server;

import com.regatta.server.core.RaceManager;
import com.regatta.server.rest.ServerEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Engine {

    final Logger log = LoggerFactory.getLogger(Engine.class);

    private void init() throws Exception {

        log.info("Starting regatta service");

        final ServerEngine serverEngine = new ServerEngine();

        //Thread.sleep(100000);

    }

    /*
     *   HERE THERE BE DRAGONS
     */
    public static void main(String[] args) throws Exception {

        final Engine engine = new Engine();
        engine.init();

    }

}
