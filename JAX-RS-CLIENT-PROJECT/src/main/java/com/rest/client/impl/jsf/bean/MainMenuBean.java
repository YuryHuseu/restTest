package com.rest.client.impl.jsf.bean;

import static com.rest.client.api.domain.View.INDEX;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MainMenuBean {

    /**
     * Redirects to schedules.xhtml page.
     *
     * @return path to redirect
     */
    public String index() {
        return INDEX.getPath();
    }
}
