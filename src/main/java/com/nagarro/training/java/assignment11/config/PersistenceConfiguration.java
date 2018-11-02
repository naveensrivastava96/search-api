package com.nagarro.training.java.assignment11.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class PersistenceConfiguration extends WebMvcConfigurerAdapter {

	public PersistenceConfiguration() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	  public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	    configurer.favorPathExtension(false).
	            favorParameter(true).
	            parameterName("mediaType").
	            ignoreAcceptHeader(true).
	            useJaf(false).
	            defaultContentType(MediaType.APPLICATION_JSON).
	            mediaType("xml", MediaType.APPLICATION_XML).
	            mediaType("json", MediaType.APPLICATION_JSON);
	  }

}
