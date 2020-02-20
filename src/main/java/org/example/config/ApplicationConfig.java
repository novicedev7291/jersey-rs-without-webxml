package org.example.config;

import io.swagger.jaxrs.config.BeanConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

/**
 * @author <a href="kuldeepyadav7291@gmail.com">Kuldeep</a>
 */
@ApplicationPath("api")
public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {
        packages("com.example.api");
        register(io.swagger.jaxrs.listing.ApiListingResource.class);
        register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, Boolean.TRUE);
        //Swagger config
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("My apis");
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/api");
        beanConfig.setHost("localhost:8180");
        beanConfig.setResourcePackage("com.example.api");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setScan(true);

        //To register custom json object mapper not failing on
        //UNKNOWN properties
        //register(MarshalingFeature.class);
    }
}
