package com.apl.a_pirates_life.domain.item.ship;

import com.apl.a_pirates_life.domain.creature.animal.Animal;
import com.apl.a_pirates_life.domain.creature.Inventory;
import com.apl.a_pirates_life.domain.item.Item;

import java.util.List;

public interface Ship extends Item {

    Animal getOwner();

    Inventory getInventory();

    List<Animal> getAnimals();
}
