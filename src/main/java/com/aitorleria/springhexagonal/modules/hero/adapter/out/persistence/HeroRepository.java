package com.aitorleria.springhexagonal.modules.hero.adapter.out.persistence;

import com.aitorleria.springhexagonal.common.annotations.Adapter;
import com.aitorleria.springhexagonal.modules.hero.application.port.out.HeroRepositoryPort;
import com.aitorleria.springhexagonal.modules.hero.domain.model.Hero;
import org.springframework.stereotype.Repository;

@Adapter
@Repository
public class HeroRepository implements HeroRepositoryPort {

    private final HeroJpaRepository heroJpaRepository;

    HeroRepository(HeroJpaRepository heroJpaRepository) {
        this.heroJpaRepository = heroJpaRepository;
    }

    @Override
    public Hero create(Hero hero) {
        HeroEntity heroEntity = HeroEntityMapper.INSTANCE.toEntity(hero);
        return HeroEntityMapper.INSTANCE.toDomainModel(heroJpaRepository.save(heroEntity));
    }

}
