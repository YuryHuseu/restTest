package com.rest.server.rest;

import com.rest.server.entity.employee.Employee;
import com.rest.server.service.testData.TestEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
@Path("/employees")
public class EmployeeRestServiceImpl implements EmployeeRestService {

    @Autowired
    private TestEmployeeService testEmployeeService;

    @Override
    @GET
//    @Produces(MediaType.APPLICATION_XML + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response findAll() {
        List<Employee> entities = testEmployeeService.findAll();
        if (entities != null){
            return Response.status(Response.Status.OK).entity(entities).build();
        }else {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
    }
}
