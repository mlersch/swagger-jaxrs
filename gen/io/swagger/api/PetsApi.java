package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PetsApiService;
import io.swagger.api.factories.PetsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Pet;
import io.swagger.model.NewPet;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/pets")


@io.swagger.annotations.Api(description = "the pets API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-05T15:47:53.695+01:00")
public class PetsApi  {
   private final PetsApiService delegate = PetsApiServiceFactory.getPetsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creates a new pet in the store.  Duplicates are allowed", response = Pet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pet.class) })
    public Response addPet(
        @ApiParam(value = "Pet to add to the store" ,required=true) NewPet body,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addPet(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single pet based on the ID supplied", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 204, message = "pet deleted", response = void.class) })
    public Response deletePet(
        @ApiParam(value = "ID of pet to delete",required=true) @PathParam("id") Long id,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePet(id,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a user based on a single ID, if the user does not have access to the pet", response = Pet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pet.class) })
    public Response findPetById(
        @ApiParam(value = "ID of pet to fetch",required=true) @PathParam("id") Long id,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findPetById(id,securityContext);
    }
    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all pets from the system that the user has access to", response = Pet.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Pet.class, responseContainer = "List") })
    public Response findPets(
        @ApiParam(value = "tags to filter by") @QueryParam("tags") List<String> tags,
        @ApiParam(value = "maximum number of results to return") @QueryParam("limit") Integer limit,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findPets(tags,limit,securityContext);
    }
}
