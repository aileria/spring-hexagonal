package com.aitorleria.springhexagonal.modules.hero.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Hero")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HeroEntity {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String realName;
    Integer strength;
}
