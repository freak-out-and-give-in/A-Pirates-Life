package com.apl.a_pirates_life.domain.model.creature.animal;

import com.apl.a_pirates_life.domain.model.action.animalaction.AnimalActions;
import com.apl.a_pirates_life.domain.model.creature.Body;
import com.apl.a_pirates_life.domain.model.creature.Inventory;
import com.apl.a_pirates_life.domain.model.creature.Species;
import com.apl.a_pirates_life.domain.model.creature.Team;
import com.apl.a_pirates_life.domain.model.tile.tiles.ChartedTile;

public interface Animal {

    String getName();

    AnimalActions getAnimalActions();

    boolean isAlive();

    Species getSpecies();

    Body getBody();

    double getPower();

    double getWeight();

    Inventory getInventory();

    ChartedTile getLocation();

    Team getTeam();
}
