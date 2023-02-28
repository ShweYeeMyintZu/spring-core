package com.demo.beans;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface QuestType {
    Type type();
    enum Type{
        Dargon,
        Dimsel,
        YoYeYo,
        Matrimony

    }
}
