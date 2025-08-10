package com.apl.a_pirates_life.domain.item.usableitem;

import com.apl.a_pirates_life.domain.item.BaseItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class BaseUsableItem implements UsableItem {

    @Getter(AccessLevel.NONE)
    private BaseItem baseItem;

    private double durability;

    private double power;

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
