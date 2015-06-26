package com.rest.server.testData;

import java.util.List;

public abstract class AbstractTestDataImpl<T> implements TestData<T> {

    protected List<T> entities;

    public abstract void setEntities(List<T> entities);

    @Override
    public List<T> getEntities() {
        return entities;
    }

    @Override
    public T getEntity() {
        return entities.iterator().next();
    }
}
