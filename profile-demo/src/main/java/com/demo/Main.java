package com.demo;

import com.demo.serivce.ComplexAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.registerShutdownHook();
        context.getEnvironment().setActiveProfiles("db");
        context.register(AppConfig.class);
        context.refresh();
        ComplexAction action=context.getBean(ComplexAction.class);
        action.reportAction();
    }
}
