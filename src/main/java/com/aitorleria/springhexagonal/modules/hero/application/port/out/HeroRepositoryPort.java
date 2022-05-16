package com.aitorleria.springhexagonal.modules.hero.application.port.out;

import com.aitorleria.springhexagonal.modules.hero.domain.model.Hero;

public interface HeroRepositoryPort {
    Hero create(Hero hero);
}
