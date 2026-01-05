package com.apl.a_pirates_life.domain.model.item.ship;

import com.apl.a_pirates_life.domain.model.creature.Inventory;
import com.apl.a_pirates_life.domain.model.creature.animal.Animal;
import com.apl.a_pirates_life.domain.model.item.Item;

import java.util.List;

public interface Ship extends Item {

    Animal getOwner();

    Inventory getInventory();

    List<Animal> getAnimals();
}
