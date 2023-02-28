package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component

public class Person {

    private String name = "Shwe Yee MyintZu";

    public Person(){
        System.out.println("Constructor:: Address ::"+ address);
    }
    @PostConstruct
    public void init(){
        System.out.println("PostConstruct::Address"+address.getClass().getSimpleName());
    }




    private Address address;

    @Autowired
    public Person(Address address){
        this.address=address;
        System.out.println("Constructor:: Address ::"+address.getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public String personInfo() {
        return name + "::" + address.getStreetName();
    }

}
