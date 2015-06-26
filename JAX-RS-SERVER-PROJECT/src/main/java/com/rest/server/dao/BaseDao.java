package com.rest.server.dao;

import java.util.List;

/**
 * Created by ygusev on 25.06.2015.
 */
public interface BaseDao<T> {

    List<T> findAll();

}
