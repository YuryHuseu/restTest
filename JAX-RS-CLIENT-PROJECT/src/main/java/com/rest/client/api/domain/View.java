package com.rest.client.api.domain;

public enum View {

//    INDEX("/pages/index?faces-redirect=true");
    EMPLOYEES("pages/employee/employees");

    private String path;

    /**
     * Constructor.
     *
     * @param path path
     */
    private View(String path) {
        this.path = path;
    }

    /**
     * Gets path.
     *
     * @return path
     */
    public String getPath() {
        return path;
    }
}
