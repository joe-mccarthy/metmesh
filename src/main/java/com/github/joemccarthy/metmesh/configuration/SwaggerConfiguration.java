package com.github.joemccarthy.metmesh.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import  io.swagger.v3.oas.annotations.info.Info;
import  io.swagger.v3.oas.annotations.info.License;

import  io.swagger.v3.oas.annotations.info.Contact;

@OpenAPIDefinition(
    info = @Info(title = SwaggerConstants.API_TITLE, 
    version = SwaggerConstants.API_VERSION, description = SwaggerConstants.API_DESCRIPTION,
    license = @License(name = SwaggerConstants.SwaggerLicence.NAME, url = SwaggerConstants.SwaggerLicence.URL), 
    contact = @Contact(name = SwaggerConstants.SwaggerContact.NAME, email = SwaggerConstants.SwaggerContact.EMAIL, 
    url = SwaggerConstants.SwaggerContact.URL)))
public class SwaggerConfiguration {
    
}
