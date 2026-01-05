package com.apl.a_pirates_life.domain.model.building.shopbuilding.shopbuildings;

import com.apl.a_pirates_life.domain.model.building.BaseBuilding;
import com.apl.a_pirates_life.domain.model.building.shopbuilding.Shop;
import com.apl.a_pirates_life.domain.model.creature.Inventory;
import com.apl.a_pirates_life.domain.model.creature.animal.Animal;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
public class ClothesShop implements Shop {

    private BaseBuilding baseBuilding;

    @Override
    public Animal getOwner() {
        return baseBuilding.getOwner();
    }

    @Override
    public String getName() {
        return baseBuilding.getName();
    }

    @Override
    public Inventory getInventory() {
        return baseBuilding.getInventory();
    }

    @Override
    public List<Animal> getAnimals() {
        return baseBuilding.getAnimals();
    }
}
