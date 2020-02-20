package org.example.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

/**
 * @author <a href="kuldeepyadav7291@gmail.com">Kuldeep</a>
 */
@Api(tags = {"Persons"})
@Path("/persons")
public class PersonResource {
    @ApiOperation("To get person by id ")
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiResponses({
            @ApiResponse(code = 200, message = "On Success" ,response = Person.class)
    })
    public Response getPerson(@PathParam(value = "id") Integer id) {
        return Response.ok().entity(getClass()
                .getClassLoader()
                .getResourceAsStream("person.json")).build();
    }

    @ApiOperation("To create new person")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiResponses({
            @ApiResponse(code = 201, message = "On Success" ,response = Person.class)
    })
    public Response createPerson(Person person) {
        return Response.created(URI.create("/persons/1")).entity(getClass()
                .getClassLoader()
                .getResourceAsStream("person.json")).build();
    }
}
