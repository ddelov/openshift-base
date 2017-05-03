package com.estafet.openshift.rest.services;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Delcho Delov on 03.05.17.
 */
public class BaseServiceTest {
		@Test
		public void hello() throws Exception {
				BaseService baseService = new BaseService();
				final String message = baseService.hello();
				assertThat(message, is("Welcome to OpenShift, Mr. Delov!"));
		}
}