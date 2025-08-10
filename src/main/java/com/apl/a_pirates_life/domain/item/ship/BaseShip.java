package com.apl.a_pirates_life.domain.item.ship;

import com.apl.a_pirates_life.domain.creature.animal.Animal;
import com.apl.a_pirates_life.domain.creature.Inventory;
import com.apl.a_pirates_life.domain.item.BaseItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public class BaseShip implements Ship {

    @Getter(AccessLevel.NONE)
    private BaseItem baseItem;

    private Animal owner;

    private Inventory inventory;

    private List<Animal> animals;

    private double health;

    @Override
    public String getName() {
        return baseItem.getName();
    }

    @Override
    public double getWeight() {
        return baseItem.getWeight();
    }

    @Override
    public double getValue() {
        return baseItem.getValue();
    }
}
