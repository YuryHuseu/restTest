package com.rest.server.service;

import java.util.List;

/**
 * Created by ygusev on 25.06.2015.
 */
public interface BaseService<T> {

    List<T> findAll();
}
