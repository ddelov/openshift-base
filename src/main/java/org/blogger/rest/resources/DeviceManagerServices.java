package org.blogger.rest.resources;

import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Created by Delcho Delov on 06.04.17.
 */

@Path("/")
public class DeviceManagerServices {
		private Logger log = Logger.getLogger(DeviceManagerServices.class);

		@GET
		@Path("/")
		@Produces(APPLICATION_JSON)
		public String hello() {
				return "Welcome to OpenShift, Mr. Delov!";
		}

}
