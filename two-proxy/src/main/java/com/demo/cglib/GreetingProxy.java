package com.demo.cglib;

public class GreetingProxy extends MyGreeting{
    @Override
    public String greet(String name) {
        return super.greet(name)+" \nHEY LONG TIME NO SEE \n NICE TO SEE YOU AGAIN!!!\n using Cglib";
    }
}
