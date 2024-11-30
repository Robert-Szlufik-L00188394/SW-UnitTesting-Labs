package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    private Car car;

    @BeforeEach
    void setup() {
        car = new Car();
    }

    @Test
    void testSetNumberOfDoors() {
        car.setNumberOfDoors(2);
    }
}


