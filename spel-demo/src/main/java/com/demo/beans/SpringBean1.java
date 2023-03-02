package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    @Value("${app.nane}")
    private String name;

    @Value("#{${invoice.amount}*0.2}")
    private double invoiceamount;

    @Value("#{'Creek Bridge Road'.toUpperCase}")
    private String streetName;
@Value("#{bean2.hobby}")

    private String hobbyName;

    public void print(){
        System.out.println("Name  ::"+name);
        System.out.println("Discount Invoice  ::"+invoiceamount);
        System.out.println("Street Name  ::"+streetName);
        System.out.println("Hobby Name"+ hobbyName);
    }
}
