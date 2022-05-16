package com.aitorleria.springhexagonal.modules.hero.adapter.in.rest;

import com.aitorleria.springhexagonal.modules.hero.domain.model.Hero;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HeroDtoMapper {

    HeroDtoMapper INSTANCE = Mappers.getMapper(HeroDtoMapper.class);

    HeroDto toDto(Hero hero);

    Hero toDomainModel(CreateHeroDto heroDto);
}
