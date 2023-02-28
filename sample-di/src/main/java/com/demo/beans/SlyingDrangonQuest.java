package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("dargon")// @QuestType(type = QuestType.Type.Dargon)
public class SlyingDrangonQuest implements Quest {
    public String goQuest(){
        return "Knight killed the dragon.";
    }
}
