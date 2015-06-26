package com.rest.server.rest;

import javax.ws.rs.core.Response;

/**
 * Created by ygusev on 25.06.2015.
 */
public interface RestService<T> {

    Response findAll();

}
