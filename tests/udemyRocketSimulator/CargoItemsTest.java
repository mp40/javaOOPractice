package udemyRocketSimulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoItemsTest {

    @Test
    void checkCargoItemHabitatCreation() {
        Item habitat = new Item("habitat", 100000);
        String name = habitat.name;
        int weight = habitat.weight;
        assertEquals(name,"habitat");
        assertEquals(weight,100000 );
    }

    @Test
    void checkCargoItemColonyCreation() {
        Item habitat = new Item("colony", 50000);
        String name = habitat.name;
        int weight = habitat.weight;
        assertEquals(name, "colony");
        assertEquals(weight,50000 );
    }

    @Test
    void checkCargoItemFoodCreation() {
        Item habitat = new Item("food", 25000);
        String name = habitat.name;
        int weight = habitat.weight;
        assertEquals(name,"food");
        assertEquals(weight, 25000 );
    }
}
