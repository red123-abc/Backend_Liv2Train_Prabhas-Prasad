package com.howtodoinjava.rest.model;

public class Centre {

    public Centre() {

    }

    public Centre(Integer id, String name, Integer size, String contactNumber, String email, String address) {
        super();
        this.id = id;
        this.name = name;
        this.size = size;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
    }

    private Integer id;
    private String name;
    private Integer size;
    private String contactNumber;
    private String email;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String contactNumber() {
        return contactNumber;
    }

    public void setcontactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Centre [id =" + id + ", Name =" + name + ", Size =" + size + ", Contact =" + contactNumber + ", email=" + email + ", Address =" + address "]";
    }
}
