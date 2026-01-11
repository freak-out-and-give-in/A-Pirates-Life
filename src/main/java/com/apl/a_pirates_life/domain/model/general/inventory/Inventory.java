package com.apl.a_pirates_life.domain.model.general.inventory;

import com.apl.a_pirates_life.domain.model.item.Item;

public interface Inventory {

    boolean addItem(Item item);

    boolean removeItem(Item item);
}
