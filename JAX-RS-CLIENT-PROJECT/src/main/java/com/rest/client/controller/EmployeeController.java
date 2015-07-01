package com.rest.client.controller;

import com.rest.client.entity.employee.Employee;
import com.rest.client.rest.client.EmployeeRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ygusev on 29.06.2015.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRestClient employeeRestClient;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String employees(Model model) {
        model.addAttribute("employees", employeeRestClient.getAll());
        return "index";
    }
}
