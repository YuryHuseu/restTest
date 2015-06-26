package com.rest.server.dao.hibernate;

import com.rest.server.dao.BaseDao;
import com.rest.server.testData.TestEmployee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ygusev on 25.06.2015.
 */
@SuppressWarnings("unchecked")
public abstract class BaseDaoImpl<T> extends HibernateDao<T> implements BaseDao<T> {
//
//    @Override
//    public List<T> findAll() {
//        return getSession().createCriteria(getPersistentClass()).list();
//    }
}
