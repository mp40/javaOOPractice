package udemyRocketSimulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RocketU2Tests {

    @Test
    void checkU2RocketCostInMillions() {
        Rocket u2 = new RocketU2();
        int result = u2.cost;
        assertEquals(result, 120 );
    }

    @Test
    void checkU2RocketWeightInTonnes() {
        Rocket u2 = new RocketU2();
        int result = u2.weight;
        assertEquals(result, 18 );
    }

    @Test
    void checkU2RocketMaxWeightWithCargoInTonnes() {
        Rocket u2 = new RocketU2();
        int result = u2.maxWeightWithCargo;
        assertEquals(result,29 );
    }
}
