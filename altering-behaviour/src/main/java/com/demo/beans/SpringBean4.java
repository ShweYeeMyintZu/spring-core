package com.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean4 {
    public SpringBean4(){
        System.out.println(this.getClass().getSimpleName());
    }
}
