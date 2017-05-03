package com.estafet.openshift.rest.services;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Delcho Delov on 03.05.17.
 */
public class HelloResourceTest {
		@Test
		public void ping() throws Exception {
				HelloResource hr = new HelloResource();
				final String ping = hr.ping();
				assertThat(ping, is("Hello World!"));
		}

}