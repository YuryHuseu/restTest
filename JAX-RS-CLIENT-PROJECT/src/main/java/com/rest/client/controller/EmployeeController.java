package com.rest.client.controller;

import com.rest.client.rest.client.EmployeeRestClient;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public void exportEmployees(Model model, HttpServletResponse response) {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Disposition", "attachment; filename=employees.xslx");

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("эмплуи");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Привет!");
        try {
            workbook.write(response.getOutputStream());
            workbook.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        model.addAttribute("employees", employeeRestClient.getAll());
    }
}
