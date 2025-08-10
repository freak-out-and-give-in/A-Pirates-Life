package com.apl.a_pirates_life.domain.game.event;

import com.apl.a_pirates_life.domain.creature.animal.Animal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public class BaseEvent implements Event {

    private String name;

    private List<Animal> animals;
}
