package com.apl.a_pirates_life.domain.model.item.ship.ships;

import com.apl.a_pirates_life.domain.model.creature.Inventory;
import com.apl.a_pirates_life.domain.model.creature.animal.Animal;
import com.apl.a_pirates_life.domain.model.item.ship.BaseShip;
import com.apl.a_pirates_life.domain.model.item.ship.Ship;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
public class FirstRate implements Ship {

    private BaseShip baseShip;

    @Override
    public Animal getOwner() {
        return baseShip.getOwner();
    }

    @Override
    public Inventory getInventory() {
        return baseShip.getInventory();
    }

    @Override
    public List<Animal> getAnimals() {
        return baseShip.getAnimals();
    }

    @Override
    public String getName() {
        return baseShip.getName();
    }

    @Override
    public double getWeight() {
        return baseShip.getWeight();
    }

    @Override
    public double getValue() {
        return baseShip.getValue();
    }
}
