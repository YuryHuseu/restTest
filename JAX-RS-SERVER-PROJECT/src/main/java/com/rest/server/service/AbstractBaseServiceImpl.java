package com.rest.server.service;

import com.rest.server.dao.BaseDao;
import com.rest.server.marshalling.Marshalling;

import java.util.List;

/**
 * Created by ygusev on 25.06.2015.
 */
public abstract class AbstractBaseServiceImpl<T, D extends BaseDao<T>> implements BaseService<T>{

    private D dao;

    public abstract void setDao(D dao);

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }
}
