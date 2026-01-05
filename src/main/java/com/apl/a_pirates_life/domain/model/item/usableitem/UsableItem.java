package com.apl.a_pirates_life.domain.model.item.usableitem;

import com.apl.a_pirates_life.domain.model.item.Item;

public interface UsableItem extends Item {

    double getDurability();

    double getPower();
}
