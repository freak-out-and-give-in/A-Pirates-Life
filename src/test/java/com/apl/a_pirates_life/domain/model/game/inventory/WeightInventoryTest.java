package com.apl.a_pirates_life.domain.model.game.inventory;

import com.apl.a_pirates_life.application.service.factory.ItemFactory;
import com.apl.a_pirates_life.domain.model.general.inventory.WeightInventory;
import com.apl.a_pirates_life.domain.model.item.Item;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Tag("UnitTest")
class WeightInventoryTest {

    // This is a very similar class to QuantityInventoryTest

    private double setMaxWeight;

    private WeightInventory weightInventory;

    private Item item;

    @BeforeEach
    void setUp() {
        setMaxWeight = 10.0;
        weightInventory = new WeightInventory(setMaxWeight);

        // The items max weight should be lower than the inventory's max weight
        // or else some tests will not work
        item = ItemFactory.makeRandomWeapon(setMaxWeight / 5);
    }

    @AfterEach
    void tearDown() {
        weightInventory = null;
        item = null;
    }

    @Test
    @DisplayName("Should add an item")
    void addItem() {
        boolean addItem = weightInventory.addItem(item);

        // The item was added
        assertTrue(addItem);
        // Only 1 item is stored
        assertEquals(1, weightInventory.getItems().size());
        // The item stored is the item that we just added
        assertEquals(item, weightInventory.getItems().getFirst());
    }

    @Test
    @DisplayName("Cannot add an item that would push the total weight of the items over the max")
    void addItem_whenOverMaxWeight() {
        // This item's weight, combined with the first item, is above the max weight
        Item item1 = ItemFactory.makeRandomWeapon((setMaxWeight - item.getWeight()) + 0.1);

        boolean addItem = weightInventory.addItem(item);

        // Trying to add the too-heavy item
        boolean addItem1 = weightInventory.addItem(item1);

        // The 1st item was added
        assertTrue(addItem);
        // The 2nd item was not added
        assertFalse(addItem1);
        // Only 1 item is stored
        assertEquals(1, weightInventory.getItems().size());
        // The item stored is the 1st item that we added
        assertEquals(item, weightInventory.getItems().getFirst());
    }

    @Test
    @DisplayName("Should remove an item")
    void removeItem() {
        // Ensure that the combined weight of the items is less than the inventory's max weight
        Item item1 = ItemFactory.makeRandomWeapon(setMaxWeight - item.getWeight() - 1);

        // Add 2 items
        weightInventory.addItem(item);
        weightInventory.addItem(item1);

        boolean removeItem = weightInventory.removeItem(item);

        // The 1st item was removed
        assertTrue(removeItem);
        // Only 1 item is stored
        assertEquals(1, weightInventory.getItems().size());
        // The item stored is the item we did not remove
        assertEquals(item1, weightInventory.getItems().getFirst());
    }

    @Test
    @DisplayName("Cannot remove an item that is not in our inventory")
    void removeItem_whenItsNotHere() {
        boolean removeItem = weightInventory.removeItem(item);

        // The item was not removed
        assertFalse(removeItem);
        // No items are stored
        assertEquals(0, weightInventory.getItems().size());
    }

    @Test
    @DisplayName("Should increase the max weight")
    void increaseMaxWeight() {
        double increaseBy = 3.6;
        double expectedMaxWeight = setMaxWeight + increaseBy;
        double actualMaxWeight = weightInventory.increaseMaxWeight(increaseBy);

        assertEquals(expectedMaxWeight, actualMaxWeight);
    }

    @Test
    @DisplayName("Should decrease the max weight")
    void decreaseMaxWeight() {
        double decreaseBy = setMaxWeight - 1.3;
        double expectedMaxWeight = setMaxWeight - decreaseBy;
        double actualMaxWeight = weightInventory.decreaseMaxWeight(decreaseBy);

        assertEquals(expectedMaxWeight, actualMaxWeight);
    }

    @Test
    @DisplayName("Should decrease the max weight to 0")
    void decreaseMaxWeight_to0() {
        double decreaseBy = setMaxWeight;
        double expectedMaxWeight = setMaxWeight - decreaseBy;
        double actualMaxWeight = weightInventory.decreaseMaxWeight(decreaseBy);

        assertEquals(expectedMaxWeight, actualMaxWeight);
    }

    @Test
    @DisplayName("Max weight cannot fall below 0")
    void decreaseMaxWeight_toLessThan0() {
        double decreaseBy = setMaxWeight + 0.1;
        double expectedMaxWeight = 0;
        double actualMaxWeight = weightInventory.decreaseMaxWeight(decreaseBy);

        assertEquals(expectedMaxWeight, actualMaxWeight);
    }

    @Test
    @DisplayName("Should get an empty list, not a null one")
    void getItems_whenEmpty() {
        List<Item> items = weightInventory.getItems();

        assertTrue(items.isEmpty());
    }

}