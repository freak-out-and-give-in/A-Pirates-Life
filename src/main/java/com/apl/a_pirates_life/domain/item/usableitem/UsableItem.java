package com.apl.a_pirates_life.domain.item.usableitem;

import com.apl.a_pirates_life.domain.item.Item;

public interface UsableItem extends Item {

    double getDurability();

    double getPower();
}
