package com.apl.a_pirates_life.application.service.factory;

import com.apl.a_pirates_life.domain.model.item.BaseItem;
import com.apl.a_pirates_life.domain.model.item.Item;
import com.apl.a_pirates_life.domain.model.item.usableitem.BaseUsableItem;
import com.apl.a_pirates_life.domain.model.item.usableitem.usableitems.Weapon;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@UtilityClass
public class ItemFactory {

    // Without weight

    public Item makeRandomWeapon() {
        return Weapon.builder()
                .range(3)
                .accuracy(10)
                .baseUsableItem(makeBaseUsableItem())
                .build();
    }

    private BaseUsableItem makeBaseUsableItem() {
        return BaseUsableItem.builder()
                .baseItem(makeBaseItem())
                .durability(10)
                .power(10)
                .build();
    }

    private BaseItem makeBaseItem() {
        return BaseItem.builder()
                .name("name")
                .weight(10)
                .value(10)
                .build();
    }

    // With weight

    public Item makeRandomWeapon(double weight) {
        return Weapon.builder()
                .range(3)
                .accuracy(10)
                .baseUsableItem(makeBaseUsableItem(weight))
                .build();
    }

    private BaseUsableItem makeBaseUsableItem(double weight) {
        return BaseUsableItem.builder()
                .baseItem(makeBaseItem(weight))
                .durability(10)
                .power(10)
                .build();
    }

    private BaseItem makeBaseItem(double weight) {
        return BaseItem.builder()
                .name("name")
                .weight(weight)
                .value(10)
                .build();
    }
}
