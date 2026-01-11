package com.apl.a_pirates_life.domain.model.game.inventory;

import com.apl.a_pirates_life.application.service.factory.ItemFactory;
import com.apl.a_pirates_life.domain.model.general.inventory.QuantityInventory;
import com.apl.a_pirates_life.domain.model.item.Item;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Tag("UnitTest")
class QuantityInventoryTest {

    // This is a very similar class to WeightInventoryTest

    private int setMaxQuantity;

    private QuantityInventory quantityInventory;

    private Item item;

    @BeforeEach
    void setUp() {
        setMaxQuantity = 1;
        quantityInventory = new QuantityInventory(setMaxQuantity);
        item = ItemFactory.makeRandomWeapon();
    }

    @AfterEach
    void tearDown() {
        quantityInventory = null;
        item = null;
    }

    @Test
    @DisplayName("Should add an item")
    void addItem() {
        boolean addItem = quantityInventory.addItem(item);

        // The item was added
        assertTrue(addItem);
        // Only 1 item is stored
        assertEquals(1, quantityInventory.getItems().size());
        // The item stored is the item that we just added
        assertEquals(item, quantityInventory.getItems().getFirst());
    }

    @Test
    @DisplayName("Cannot add an item that would push the total quantity of the items over the max")
    void addItem_whenOverMaxQuantity() {
        Item item1 = ItemFactory.makeRandomWeapon();

        boolean addItem = quantityInventory.addItem(item);

        // Trying to add one more item
        boolean addItem1 = quantityInventory.addItem(item1);

        // The 1st item was added
        assertTrue(addItem);
        // The 2nd item was not added
        assertFalse(addItem1);
        // Only 1 item is stored
        assertEquals(1, quantityInventory.getItems().size());
        // The item stored is the 1st item that we added
        assertEquals(item, quantityInventory.getItems().getFirst());
    }

    @Test
    @DisplayName("Should remove an item")
    void removeItem() {
        // Changing the max quantity here so we can test if it works when > 1 items are stored
        quantityInventory = new QuantityInventory(3);
        Item item1 = ItemFactory.makeRandomWeapon();

        // Add 2 items
        quantityInventory.addItem(item);
        quantityInventory.addItem(item1);

        boolean removeItem = quantityInventory.removeItem(item);

        // The 1st item was removed
        assertTrue(removeItem);
        // Only 1 item is stored
        assertEquals(1, quantityInventory.getItems().size());
        // The item stored is the item we did not remove
        assertEquals(item1, quantityInventory.getItems().getFirst());
    }

    @Test
    @DisplayName("Cannot remove an item that is not in our inventory")
    void removeItem_whenItsNotHere() {
        boolean removeItem = quantityInventory.removeItem(item);

        // The item was not removed
        assertFalse(removeItem);
        // No items are stored
        assertEquals(0, quantityInventory.getItems().size());
    }

    @Test
    @DisplayName("Should increase the max quantity")
    void increaseMaxQuantity() {
        int increaseBy = 1;
        int expectedMaxQuantity = setMaxQuantity + increaseBy;
        int actualMaxQuantity = quantityInventory.increaseMaxQuantity(increaseBy);

        assertEquals(expectedMaxQuantity, actualMaxQuantity);
    }

    @Test
    @DisplayName("Should decrease the max quantity")
    void decreaseMaxQuantity() {
        int decreaseBy = setMaxQuantity - 2;
        int expectedMaxQuantity = setMaxQuantity - decreaseBy;
        int actualMaxQuantity = quantityInventory.decreaseMaxQuantity(decreaseBy);

        assertEquals(expectedMaxQuantity, actualMaxQuantity);
    }

    @Test
    @DisplayName("Should decrease the max quantity to 0")
    void decreaseMaxQuantity_to0() {
        int decreaseBy = setMaxQuantity;
        int expectedMaxQuantity = 0;
        int actualMaxQuantity = quantityInventory.decreaseMaxQuantity(decreaseBy);

        assertEquals(expectedMaxQuantity, actualMaxQuantity);
    }

    @Test
    @DisplayName("Max quantity cannot fall below 0")
    void decreaseMaxQuantity_toLessThan0() {
        int decreaseBy = setMaxQuantity + 1;
        int expectedMaxQuantity = 0;
        int actualMaxQuantity = quantityInventory.decreaseMaxQuantity(decreaseBy);

        assertEquals(expectedMaxQuantity, actualMaxQuantity);
    }

    @Test
    @DisplayName("Should get an empty list, not a null one")
    void getItems_whenEmpty() {
        List<Item> items = quantityInventory.getItems();

        assertTrue(items.isEmpty());
    }

}