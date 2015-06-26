package com.rest.server.testData;

import java.util.List;

public interface TestData<T> {

    List<T> getEntities();

    T getEntity();
}
