package com.rest.server.testData;

import com.rest.server.entity.employee.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestEmployeeBean extends AbstractTestDataImpl<Employee> implements TestEmployee {

    @Override
    public void setEntities(List<Employee> entities) {
        this.entities = entities;
    }
}
