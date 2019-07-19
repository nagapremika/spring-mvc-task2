package com.stackroute.exercise2;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String password;
    public User(String name, String password) {     //Parameterized constructor
        this.name = name;
        this.password = password;
    }

    public User() {     //Default constructor
    }

    public String getName() {       //getter()
        return name;
    }

    public void setName(String name) {      //setter()
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
