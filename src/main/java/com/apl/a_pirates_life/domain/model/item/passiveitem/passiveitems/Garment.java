package com.apl.a_pirates_life.domain.model.item.passiveitem.passiveitems;

import com.apl.a_pirates_life.domain.model.item.Pattern;
import com.apl.a_pirates_life.domain.model.item.passiveitem.BasePassiveItem;
import com.apl.a_pirates_life.domain.model.item.passiveitem.PassiveItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class Garment implements PassiveItem {

    @Getter(AccessLevel.NONE)
    private BasePassiveItem basePassiveItem;

    private double health;

    private double protection;

    private Pattern pattern;

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
