package com.aitorleria.springhexagonal.modules.hero.application.port.in;

import com.aitorleria.springhexagonal.modules.hero.domain.model.Hero;

public interface CreateHeroPort {
    Hero create(CreateHeroCommand command);
}
