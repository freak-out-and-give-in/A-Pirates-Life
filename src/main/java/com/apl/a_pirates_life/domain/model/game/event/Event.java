package com.apl.a_pirates_life.domain.model.game.event;

import com.apl.a_pirates_life.domain.model.creature.animal.Animal;

import java.util.List;

public interface Event {

    String getName();

    List<Animal> getAnimals();
}
