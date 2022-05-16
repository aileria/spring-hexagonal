package com.aitorleria.springhexagonal.modules.hero.application.service;

import com.aitorleria.springhexagonal.common.annotations.UseCase;
import com.aitorleria.springhexagonal.modules.hero.application.port.in.CreateHeroCommand;
import com.aitorleria.springhexagonal.modules.hero.application.port.in.CreateHeroPort;
import com.aitorleria.springhexagonal.modules.hero.application.port.out.HeroRepositoryPort;
import com.aitorleria.springhexagonal.modules.hero.domain.model.Hero;

@UseCase
public class CreateHeroService implements CreateHeroPort {

    private final HeroRepositoryPort heroRepositoryPort;

    CreateHeroService(HeroRepositoryPort heroRepositoryPort) {
        this.heroRepositoryPort = heroRepositoryPort;
    }

    @Override
    public Hero create(CreateHeroCommand command) {
        Hero hero = Hero.builder()
                .name(command.getName())
                .realName(command.getRealName())
                .strength(command.getStrength())
                .build();
        return heroRepositoryPort.create(hero);
    }

}
