package com.apl.a_pirates_life.domain.building;

import com.apl.a_pirates_life.domain.creature.animal.Animal;
import com.apl.a_pirates_life.domain.creature.Inventory;

import java.util.List;

public interface Building {

    Animal getOwner();

    String getName();

    Inventory getInventory();

    List<Animal> getAnimals();
}
