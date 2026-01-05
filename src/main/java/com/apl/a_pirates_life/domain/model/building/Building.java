package com.apl.a_pirates_life.domain.model.building;

import com.apl.a_pirates_life.domain.model.creature.Inventory;
import com.apl.a_pirates_life.domain.model.creature.animal.Animal;

import java.util.List;

public interface Building {

    Animal getOwner();

    String getName();

    Inventory getInventory();

    List<Animal> getAnimals();
}
