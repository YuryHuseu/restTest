package com.rest.server.marshalling.employeeMarshalling;

import com.rest.server.entity.employee.EmployeeMap;
import com.rest.server.marshalling.AbstractMarshallingImpl;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by ygusev on 25.06.2015.
 */
public class EmployeeMarshallingImpl extends AbstractMarshallingImpl<EmployeeMap> implements EmployeeMarshalling {

    EmployeeMarshallingImpl(Class<EmployeeMap> typeParameterClass) {
        super(typeParameterClass);
    }

    @Override
    @Value("${propertyName}")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    @Value("${propertyName}")
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
