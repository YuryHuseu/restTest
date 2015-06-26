package com.rest.server.rest;

import com.rest.server.service.BaseService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by ygusev on 25.06.2015.
 */
public abstract class AbstractRestServiceImpl<T> implements RestService<T> {

    protected abstract BaseService<T> getService();

    @Override
    @GET
    @Path("/employees")
    public Response findAll() {
        List<T> entities = getService().findAll();
        return returnEntityCheck(entities);
    }

    private  <E> Response returnEntityCheck(E entity) {
        if (entity != null){
            return Response.status(Response.Status.OK).entity(entity).build();
        }else {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
    }
}
