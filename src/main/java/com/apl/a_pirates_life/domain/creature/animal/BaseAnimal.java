package com.apl.a_pirates_life.domain.creature.animal;

import com.apl.a_pirates_life.domain.action.animalaction.AnimalActions;
import com.apl.a_pirates_life.domain.creature.Body;
import com.apl.a_pirates_life.domain.creature.Inventory;
import com.apl.a_pirates_life.domain.creature.Species;
import com.apl.a_pirates_life.domain.creature.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class BaseAnimal implements Animal {

    private String name;

    private AnimalActions animalActions;

    @Getter(onMethod_ = @__(@Override))
    private boolean alive;

    private Species species;

    private Body body;

    private double power;

    private double weight;

    private Inventory inventory;

    private Location location;

    private Team team;
}
