package com.app.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/")
public class HelloController {

	
	@GET
	public String sayHelloFromGet() {
		return "Hello Welcome to JAX-RS RESTful programming using JERSEY API GET Method";
	}
	
	@POST
	public String sayHelloFromPost() {
		return "Hello Welcome to JAX-RS RESTful programming using JERSEY API POST Method";
	}
	@PUT
	public String sayHelloFromPut() {
		return "Hello Welcome to JAX-RS RESTful programming using JERSEY API PUT Method";
	}
	@DELETE
	public String sayHelloFromDelete() {
		return "Hello Welcome to JAX-RS RESTful programming using JERSEY API DELETE Method";
	}
}
