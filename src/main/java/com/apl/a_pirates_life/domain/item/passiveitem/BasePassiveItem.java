package com.apl.a_pirates_life.domain.item.passiveitem;

import com.apl.a_pirates_life.domain.item.BaseItem;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class BasePassiveItem implements PassiveItem {

    private BaseItem baseItem;

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
