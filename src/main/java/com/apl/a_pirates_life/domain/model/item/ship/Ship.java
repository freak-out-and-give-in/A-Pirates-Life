package com.apl.a_pirates_life.domain.model.item.ship;

import com.apl.a_pirates_life.domain.model.creature.animal.Animal;
import com.apl.a_pirates_life.domain.model.general.inventory.WeightInventory;
import com.apl.a_pirates_life.domain.model.item.Item;

import java.util.List;

public interface Ship extends Item {

    Animal getOwner();

    WeightInventory getInventory();

    List<Animal> getAnimals();
}
