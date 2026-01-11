package com.apl.a_pirates_life.domain.model.creature.animal;

import com.apl.a_pirates_life.domain.model.action.animalaction.AnimalActions;
import com.apl.a_pirates_life.domain.model.creature.Body;
import com.apl.a_pirates_life.domain.model.creature.Species;
import com.apl.a_pirates_life.domain.model.creature.Team;
import com.apl.a_pirates_life.domain.model.general.inventory.Inventory;
import com.apl.a_pirates_life.domain.model.tile.tiles.ChartedTile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
@Builder
public class BaseAnimal implements Animal {

    private String name;

    private final AnimalActions animalActions = new AnimalActions();

    private boolean alive;

    private Species species;

    private Body body;

    private double power;

    private double weight;

    private Inventory inventory;

    private ChartedTile location;

    private Team team;
}
