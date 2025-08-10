package com.apl.a_pirates_life.domain.creature.animal.animals;

import com.apl.a_pirates_life.domain.action.animalaction.AnimalActions;
import com.apl.a_pirates_life.domain.creature.*;
import com.apl.a_pirates_life.domain.creature.animal.Animal;
import com.apl.a_pirates_life.domain.creature.animal.BaseAnimal;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Fish implements Animal {

    private BaseAnimal baseAnimal;

    @Override
    public String getName() {
        return baseAnimal.getName();
    }

    @Override
    public AnimalActions getAnimalActions() {
        return baseAnimal.getAnimalActions();
    }

    @Override
    public boolean getAlive() {
        return baseAnimal.getAlive();
    }

    @Override
    public Species getSpecies() {
        return baseAnimal.getSpecies();
    }

    @Override
    public Body getBody() {
        return baseAnimal.getBody();
    }

    @Override
    public double getPower() {
        return baseAnimal.getPower();
    }

    @Override
    public double getWeight() {
        return baseAnimal.getWeight();
    }

    @Override
    public Inventory getInventory() {
        return baseAnimal.getInventory();
    }

    @Override
    public Location getLocation() {
        return baseAnimal.getLocation();
    }

    @Override
    public Team getTeam() {
        return baseAnimal.getTeam();
    }
}
