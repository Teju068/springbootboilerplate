package com.aimids.restspis.aimidsrestapis.models;

public class User {

    private Integer id;
    private String name;
    private String address;

    public User(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
