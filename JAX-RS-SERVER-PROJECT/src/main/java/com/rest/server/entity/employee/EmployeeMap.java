package com.rest.server.entity.employee;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ygusev on 25.06.2015.
 */
@XmlRootElement(name="employees")
public class EmployeeMap {

    private Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }
}
