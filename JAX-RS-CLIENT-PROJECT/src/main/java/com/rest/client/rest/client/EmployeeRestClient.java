package com.rest.client.rest.client;

import com.rest.client.entity.employee.Employee;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ygusev on 30.06.2015.
 */
public class EmployeeRestClient {

    private String getAllUrl;


    public void setServiceUrl(String serviceUrl) {
        this.getAllUrl = serviceUrl + "/all";
    }

    public List<Employee> getAll() {
//        ClientConfig config = new DefaultClientConfig();
//        config.getClasses().add(JacksonJaxbJsonProvider.class);
//        config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create();
        WebResource webResource = client.resource(this.getAllUrl);
        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
//        List<Employee> empl = webResource.accept("application/json").get(new GenericType<List<Employee>>(){});
        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
        }
        System.out.println("===================== Output from Server ========================\n");
        System.out.println(response.getEntity(String.class));
        System.out.println("=================================================================\n");

        List<Employee> employees = Arrays.asList(response.getEntity(Employee[].class));
        return null;
    }
}
