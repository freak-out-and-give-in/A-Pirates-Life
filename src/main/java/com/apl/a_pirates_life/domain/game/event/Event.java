package com.apl.a_pirates_life.domain.game.event;

import com.apl.a_pirates_life.domain.creature.animal.Animal;

import java.util.List;

public interface Event {

    String getName();

    List<Animal> getAnimals();
}
