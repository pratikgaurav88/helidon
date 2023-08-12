package com.oracle.controller;

import java.util.Date;
import io.helidon.security.annotations.Authenticated;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RequestScoped
@Path("/get-time")
public class SampleController {
	
	@GET
	@Authenticated
	@RolesAllowed(value = "users")
	public String getTime() {
		return "Current Date and Time is :: "+new Date();
	}
}
