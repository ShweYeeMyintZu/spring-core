package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    @Value("${app.invoice}")
    private int invoice;
    @Value("${app.name}")
    private String name;
    @Value("${app.vm.name}")
    private String vm;
    @Value("${user.name}")
    private String home;

    @Value("${os.name}")
    private String osname;


    public void print(){
        System.out.println("Invoice:"+invoice);
        System.out.println("AppName: "+name);
        System.out.println("Vm Name: "+vm);
        System.out.println("UserDotName: "+home);
        System.out.println("OSDotName"+osname);
    }


}
