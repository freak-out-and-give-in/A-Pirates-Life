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
public class WeightInventory implements Inventory {

    // This is a very similar class to QuantityInventory

    private List<Item> items = new ArrayList<>();

    // This is a non-primitive type and @Non-Null
    // because it needs to be for the @RequiredArgsConstructor to target it
    @NonNull
    private Double maxWeight;

    public boolean addItem(Item item) {
        // If adding this item wouldn't mean going over the weight limit, then add it
        if (item.getWeight() + getItemsCurrentWeight() <= maxWeight) {
            items.add(item);

            return true;
        }

        return false;
    }

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

    public double increaseMaxWeight(double increaseBy) {
        maxWeight += increaseBy;

        return maxWeight;
    }

    public double decreaseMaxWeight(double decreaseBy) {
        maxWeight -= decreaseBy;

        if (maxWeight < 0) {
            maxWeight = 0.0;
        }

        return maxWeight;
    }

    private double getItemsCurrentWeight() {
        return items.stream().mapToDouble(Item::getWeight).sum();
    }
}
