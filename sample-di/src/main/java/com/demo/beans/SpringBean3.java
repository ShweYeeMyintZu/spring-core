package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SpringBean3 implements MyInterface {
    public SpringBean3(){
        System.out.println("SpringBean3");
    }


}
