package com.aitorleria.springhexagonal.modules.hero.adapter.out.persistence;

import com.aitorleria.springhexagonal.modules.hero.domain.model.Hero;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HeroEntityMapper {

    HeroEntityMapper INSTANCE = Mappers.getMapper(HeroEntityMapper.class);

    HeroEntity toEntity(Hero hero);

    Hero toDomainModel(HeroEntity heroEntity);
    
}
