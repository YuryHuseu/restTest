package com.rest.server.dao.testData;

import com.rest.server.entity.employee.Employee;
import com.rest.server.testData.TestEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class TestEmployeeDaoImpl implements TestEmployeeDao {

    @Autowired
    private TestEmployee testEmployee;

    @Override
    public List<Employee> findAll() {
        return testEmployee.getEntities();
    }
}
