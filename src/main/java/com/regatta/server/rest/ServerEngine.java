package com.regatta.server.rest;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.Protocol;
import org.restlet.resource.Directory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerEngine extends Application {

    final Logger log = LoggerFactory.getLogger(ServerEngine.class);

    public static final String ROOT_URI = "file:///C:/PROGRAMMING/Regatta/RegattaServer/src/main/resources/public";

    private static final int PORT = 9001;

    public ServerEngine() throws Exception {

        log.info("Starting rest server");

        final Component component = new Component();
        component.getServers().add(Protocol.HTTP, PORT);
        component.getClients().add(Protocol.FILE);

        // Create an application
        final Application application = new Application() {
            @Override
            public Restlet createInboundRoot() {
                return new Directory(getContext(), ROOT_URI);
            }
        };

        component.getDefaultHost().attach(application);
        component.start();

        log.info("Rest Server Started");
        log.info("URL: http://localhost:9001");

    }

}
