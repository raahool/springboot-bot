/**
 * 
 */
package com.sap.sample.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

/**
 * The Interface SampleService.
 */
@Path("/checkConnection")
@Service
public interface SampleService {

	/**
	 * Check connection.
	 *
	 * @param urlToCheck
	 *            the url to check
	 * @return the response
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	Response checkConnection(@QueryParam("urlToCheck") String urlToCheck);
}