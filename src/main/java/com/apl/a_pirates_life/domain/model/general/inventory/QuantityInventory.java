package com.apl.a_pirates_life.domain.model.general.inventory;

import com.apl.a_pirates_life.domain.model.item.Item;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
@RequiredArgsConstructor
public class QuantityInventory implements Inventory {

    // This is a very similar class to WeightInventory

    private List<Item> items = new ArrayList<>();

    // This is a non-primitive type and @Non-Null
    // because it needs to be for the @RequiredArgsConstructor to target it
    @NonNull
    private Integer maxQuantity;

    public boolean addItem(Item item) {
        // If there is room for at least 1 more item
        if (items.size() < maxQuantity) {
            items.add(item);

            return true;
        }

        return false;
    }

    // Same method as WeightInventory.removeItem()
    public boolean removeItem(Item item) {
        // If the item is not in this inventory
        if (!items.contains(item)) {
            log.error("The item: {}, cannot be removed because it is not in this inventory.", item.getName());

            return false;
        } else {
            items.remove(item);

            return true;
        }
    }

    public int increaseMaxQuantity(int increaseBy) {
        maxQuantity += increaseBy;

        return maxQuantity;
    }

    public int decreaseMaxQuantity(int decreaseBy) {
        maxQuantity -= decreaseBy;

        if (maxQuantity < 0) {
            maxQuantity = 0;
        }

        return maxQuantity;
    }
}
