package com.apl.a_pirates_life.domain.model.creature;

import com.apl.a_pirates_life.domain.model.item.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public class Inventory {

    private List<Item> items;

    private double maxWeight;

    private int maxQuantity;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double increaseMaxWeight(double increaseBy) {
        maxWeight += increaseBy;

        return maxWeight;
    }

    public double decreaseMaxWeight(double decreaseBy) {
        maxWeight -= decreaseBy;

        return maxWeight;
    }

    public int increaseMaxQuantity(int increaseBy) {
        maxQuantity += increaseBy;

        return maxQuantity;
    }

    public int decreaseMaxQuantity(int decreaseBy) {
        maxQuantity -= decreaseBy;

        return maxQuantity;
    }
}
