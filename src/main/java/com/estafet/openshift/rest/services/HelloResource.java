package com.estafet.openshift.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

public class HelloResource {

		@GET
		@Path("/device")
		@Produces(APPLICATION_JSON)
		public String ping(){

				return "Hello World!";
		}

}
