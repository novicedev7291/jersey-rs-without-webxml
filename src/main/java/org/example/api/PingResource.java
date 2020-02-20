package org.example.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author <a href="kuldeepyadav7291@gmail.com">Kuldeep</a>
 */
@Path("/ping")
public class PingResource {
    @GET
    public Response getTest(){
        return Response.ok().build();
    }
}
