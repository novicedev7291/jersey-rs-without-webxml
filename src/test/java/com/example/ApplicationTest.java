package com.example;

import org.example.api.PingResource;
import org.example.config.ApplicationConfig;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

/**
 * @author <a href="kuldeepyadav7291@gmail.com">Kuldeep</a>
 */
public class ApplicationTest {
    public void configShouldRun() {
        ResourceConfig config = new ResourceConfig(PingResource.class);
        String baseURI = "http://0.0.0.0:8082/api";
        try{
            HttpServer server = GrizzlyHttpServerFactory
                        .createHttpServer(URI.create(baseURI), config);
            server.start();
            System.out.println("Application server started with uri : " + baseURI);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
