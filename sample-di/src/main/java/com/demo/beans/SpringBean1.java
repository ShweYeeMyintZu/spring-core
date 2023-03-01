package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 implements MyInterface,Ordered {
    public SpringBean1(){
      //  System.out.println("SpringBean1");

    }

    @Override
    public String toString() {
        return "SpringBean1";
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
