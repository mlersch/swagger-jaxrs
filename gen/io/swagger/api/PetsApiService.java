package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Pet;
import io.swagger.model.NewPet;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-05T15:47:53.695+01:00")
public abstract class PetsApiService {
  
      public abstract Response addPet(NewPet body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response deletePet(Long id,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response findPetById(Long id,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response findPets(List<String> tags,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
  
}
