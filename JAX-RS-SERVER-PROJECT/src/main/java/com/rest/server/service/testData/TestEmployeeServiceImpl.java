package com.rest.server.service.testData;

import com.rest.server.dao.testData.TestEmployeeDao;
import com.rest.server.entity.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestEmployeeServiceImpl implements TestEmployeeService {

    @Autowired
    private TestEmployeeDao testEmployeeDao;

    @Override
    public List<Employee> findAll() {
        return testEmployeeDao.findAll();
    }
}
