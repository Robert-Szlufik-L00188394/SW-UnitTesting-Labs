package vehicles;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Tag("vehicles")
class CarSuiteTest {

    private Car car;

    @Test
    void getNumberOfDoors() {
        // given
        int numberOfDoors = 5;
        // when
        this.car = new Car(numberOfDoors);
        // then
        assertEquals(numberOfDoors, this.car.getNumberOfDoors());
        assertNotEquals(numberOfDoors - 1, this.car.getNumberOfDoors());
    }

    @Test
    void setNumberOfDoors() {
        // given
        int numberOfDoors = 5;
        this.car = new Car();
        // when
        this.car.setNumberOfDoors(numberOfDoors);
        // then
        assertEquals(numberOfDoors, this.car.getNumberOfDoors());
        assertNotEquals(numberOfDoors - 1, this.car.getNumberOfDoors());
    }


}