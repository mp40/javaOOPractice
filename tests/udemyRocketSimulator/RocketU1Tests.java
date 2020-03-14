package udemyRocketSimulator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RocketU1Tests {

    private Rocket u1;

    @BeforeEach
    private void setup() {
        u1 = new RocketU1();
    }

    @Test
    void checkU1RocketCostInMillions() {
        int result = u1.cost;
        assertEquals(result, 100 );
    }

    @Test
    void checkU1RocketWeightInTonnes() {
        int result = u1.weight;
        assertEquals(result, 10 );
    }

    @Test
    void checkU1RocketMaxWeightWithCargoInTonnes() {
        int result = u1.maxWeightWithCargo;
        assertEquals(result, 18 );
    }

    @Test
    void checkU1RocketCanCarryItemUnderWeightRestriction() {
        Item tools = new Item("tools", 5000);
        boolean result = u1.canCarry(tools);
        assertTrue(result);
    }

    @Test
    void checkU1RocketCanCarryItemOverWeightRestriction() {
        Item tools = new Item("tools", 9000);
        boolean result = u1.canCarry(tools);
        assertFalse(result);
    }

    @Test
    void checkU1RocketCanCarryItemAndUpdateRocketWeight() {
        Item tools = new Item("tools", 1000);
        int result = u1.weight + tools.weight / 1000;
        u1.carry(tools);
        assertEquals(result, u1.weight);
    }
    
}
