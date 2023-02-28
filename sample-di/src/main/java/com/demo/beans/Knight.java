package com.demo.beans;

import com.demo.MyClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Knight {
    @Autowired
    private Quest dimsel;
    private MyClass myClass;

    public Knight(Quest dimsel, Optional<MyClass> myClass) {
        this.dimsel = dimsel;
        //this.myClass = myClass;
    }

    public void setQuest(Quest quest) {
        this.dimsel = quest;
    }

    public String goQuest(){
        return dimsel.goQuest();
    }
    @Autowired
    public void setSpringBean(List<MyInterface> list){

    }
}
