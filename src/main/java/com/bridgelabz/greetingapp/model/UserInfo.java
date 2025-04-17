package com.bridgelabz.greetingapp.model;

import jakarta.persistence.Entity;


public class UserInfo {

    private String firstName;
    private String lastName;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return  firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return  lastName;
    }

}
