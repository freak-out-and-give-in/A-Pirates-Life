package com.apl.a_pirates_life.domain.item.passiveitem.passiveitems;

import com.apl.a_pirates_life.domain.item.passiveitem.BasePassiveItem;
import com.apl.a_pirates_life.domain.item.passiveitem.PassiveItem;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Sterling implements PassiveItem {

    private BasePassiveItem basePassiveItem;

    @Override
    public String getName() {
        return basePassiveItem.getName();
    }

    @Override
    public double getWeight() {
        return basePassiveItem.getWeight();
    }

    @Override
    public double getValue() {
        return basePassiveItem.getValue();
    }
}
