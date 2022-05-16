package com.aitorleria.springhexagonal.modules.hero.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Hero {
    Long id;
    String name;
    String realName;
    Integer strength;

    public Hero(String name, String realName, Integer strength) {
        this.name = name;
        this.realName = realName;
        this.strength = strength;
    }
}
