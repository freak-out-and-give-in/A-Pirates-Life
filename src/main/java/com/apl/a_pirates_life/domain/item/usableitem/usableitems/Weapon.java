package com.apl.a_pirates_life.domain.item.usableitem.usableitems;

import com.apl.a_pirates_life.domain.item.usableitem.BaseUsableItem;
import com.apl.a_pirates_life.domain.item.usableitem.UsableItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class Weapon implements UsableItem {

    @Getter(AccessLevel.NONE)
    private BaseUsableItem baseUsableItem;

    private double range;

    private double accuracy;

    @Override
    public double getDurability() {
        return baseUsableItem.getDurability();
    }

    @Override
    public double getPower() {
        return baseUsableItem.getPower();
    }

    @Override
    public String getName() {
        return baseUsableItem.getName();
    }

    @Override
    public double getWeight() {
        return baseUsableItem.getWeight();
    }

    @Override
    public double getValue() {
        return baseUsableItem.getValue();
    }
}
