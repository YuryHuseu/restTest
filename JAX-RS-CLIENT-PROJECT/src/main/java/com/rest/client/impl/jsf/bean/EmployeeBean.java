package com.rest.client.impl.jsf.bean;

import com.rest.client.impl.domain.Employee;
import com.rest.client.impl.rest.client.EmployeeRestClient;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 * Employee bean.
 * <p>
 * Date: 14.07.2015
 *
 * @author Yury Huseu
 */
@ManagedBean
public class EmployeeBean {

    private static final int EMPLOYEE_PAGE_COUNT = 2;


    private List<Employee> employees;

    @ManagedProperty("#{employeeRestClient}")
    private EmployeeRestClient employeeRestClient;

    /**
     * Inits bean state.
     */
    @PostConstruct
    public void init() {
        employees = employeeRestClient.getAll();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Integer getRowCount() {
        return EMPLOYEE_PAGE_COUNT;
    }

    public void setEmployeeRestClient(EmployeeRestClient employeeRestClient) {
        this.employeeRestClient = employeeRestClient;
    }
}
