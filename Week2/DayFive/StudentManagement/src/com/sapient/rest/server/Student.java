package com.sapient.rest.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Student {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getString()
	{
		return "Introduction to REST";
	}
}
