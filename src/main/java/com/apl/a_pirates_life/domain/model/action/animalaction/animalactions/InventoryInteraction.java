package com.apl.a_pirates_life.domain.model.action.animalaction.animalactions;

import com.apl.a_pirates_life.domain.model.creature.animal.Animal;
import com.apl.a_pirates_life.domain.model.general.inventory.Inventory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InventoryInteraction {

    public Inventory viewInventory(Animal animal) {
        return animal.getInventory();
    }

    public void viewItem() {
    }
}
