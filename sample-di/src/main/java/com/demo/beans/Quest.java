package com.demo.beans;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public interface Quest {
    String goQuest();

}
