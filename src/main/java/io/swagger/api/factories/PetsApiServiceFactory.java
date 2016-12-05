package io.swagger.api.factories;

import io.swagger.api.PetsApiService;

import io.swagger.api.impl.*;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-05T11:03:40.085+01:00")
public class PetsApiServiceFactory {

   private final static PetsApiService service = new PetsApiServiceImpl();

   public static PetsApiService getPetsApi()
   {
      return service;
   }
}
