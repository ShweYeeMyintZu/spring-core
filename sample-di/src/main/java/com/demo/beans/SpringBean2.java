package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component @Order(1)
public class SpringBean2 implements MyInterface {
    public SpringBean2(){
        //System.out.println("SpringBean2");
    }

    @Override
    public String toString() {
        return "SpringBean2";
    }
}
