package com.aitorleria.springhexagonal.modules.hero.adapter.in.rest;

import com.aitorleria.springhexagonal.common.annotations.Adapter;
import com.aitorleria.springhexagonal.modules.hero.application.port.in.CreateHeroCommand;
import com.aitorleria.springhexagonal.modules.hero.application.port.in.CreateHeroPort;
import com.aitorleria.springhexagonal.modules.hero.domain.model.Hero;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Adapter
@RestController()
@Tag(name = "Hero")
@RequestMapping(path = "/api/heroes")
public class HeroController {

    private final CreateHeroPort createHeroPort;

    HeroController(CreateHeroPort createHeroPort) {
        this.createHeroPort = createHeroPort;
    }

    @PostMapping
    HeroDto createHero(@RequestBody CreateHeroDto heroDto) {
        CreateHeroCommand command = CreateHeroCommand.builder()
                .name(heroDto.getName())
                .realName(heroDto.getRealName())
                .strength(heroDto.getStrength())
                .build();
        Hero createdHero = createHeroPort.create(command);
        return HeroDtoMapper.INSTANCE.toDto(createdHero);
    }

}
