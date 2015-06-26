package com.rest.server.dao.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Created by ygusev on 25.06.2015.
 */
public class HibernateDao<T> {
//
//    @SuppressWarnings("unchecked")
//    public HibernateDao() {
//        for (Type type = getClass().getGenericSuperclass(); type != null; ) {
//            if (type instanceof ParameterizedType) {
//                Object parameter = ((ParameterizedType) type).getActualTypeArguments()[0];
//
//                if (parameter instanceof Class) {
//                    persistentClass = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
//                } else {
//                    persistentClass = (Class<T>) ((ParameterizedType) ((TypeVariable<?>) parameter).getBounds()[0]).getRawType();
//                }
//
//                break;
//            } else if (type instanceof Class) {
//                type = ((Class<?>) type).getGenericSuperclass();
//            }
//        }
//    }
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    private Class<T> persistentClass;
//
//    public Session getSession() {
//        return sessionFactory.getCurrentSession();
//    }
//
//    public Class<T> getPersistentClass() {
//        return persistentClass;
//    }
}
