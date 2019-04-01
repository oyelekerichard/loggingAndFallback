package com.isslng.loggingfallback;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.Collections;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.*;
import java.util.Collection;

@Configuration
@EnableSwagger2
public class SwaggerConfig 
{
	public Docket api() 
	{ 
	     return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.example.logingfallback"))          
	          .paths(PathSelectors.ant("/name/*"))                          
	          .build()
	          .apiInfo(apiInfo())
	          .useDefaultResponseMessages(false);                                           
	}
	
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "My REST API", 
	      "Some custom description of API.", 
	      "API TOS", 
	      "Terms of service", 
	      new Contact("podeum", "www.isslng.com", "richard.oyeleke@isslng.com"), 
	      "License of API", "API license URL", java.util.Collections.emptyList());
	}
	
}
