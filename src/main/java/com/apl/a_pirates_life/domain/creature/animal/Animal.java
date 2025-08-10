package com.apl.a_pirates_life.domain.creature.animal;

import com.apl.a_pirates_life.domain.action.animalaction.AnimalActions;
import com.apl.a_pirates_life.domain.creature.Body;
import com.apl.a_pirates_life.domain.creature.Inventory;
import com.apl.a_pirates_life.domain.creature.Species;
import com.apl.a_pirates_life.domain.creature.Team;

public interface Animal {

    String getName();

    AnimalActions getAnimalActions();

    boolean getAlive();

    Species getSpecies();

    Body getBody();

    double getPower();

    double getWeight();

    Inventory getInventory();

    Location getLocation();

    Team getTeam();
}
