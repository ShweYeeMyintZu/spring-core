package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 implements MyInterface {
    public SpringBean1(){
        System.out.println("SpringBean1");

    }


}
