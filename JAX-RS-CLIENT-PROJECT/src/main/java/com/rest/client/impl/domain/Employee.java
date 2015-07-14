package com.rest.client.impl.domain;

/**
 * Created by ygusev on 25.06.2015.
 */
//@XmlRootElement
public class Employee {

    private Integer id;
    private String firstName;
    private String secondName;
    private String middleName;

//    @XmlAttribute
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
