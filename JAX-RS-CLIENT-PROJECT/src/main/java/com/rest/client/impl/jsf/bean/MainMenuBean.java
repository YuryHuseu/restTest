package com.rest.client.impl.jsf.bean;

import static com.rest.client.api.domain.View.EMPLOYEES;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MainMenuBean {

    /**
     * Redirects to employees.xhtml page.
     *
     * @return path to redirect
     */
    public String employees() {
        return EMPLOYEES.getPath();
    }
}
