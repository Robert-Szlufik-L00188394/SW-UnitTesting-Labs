package vehicles;

public class Car {
    private int numberOfDoors;

    public Car() {
        this.numberOfDoors = 0;
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int setNumberOfDoors(int numberOfDoors) {
        if (0 < numberOfDoors && numberOfDoors <= 10) {
            this.numberOfDoors = numberOfDoors;
            return numberOfDoors;
        } else {
            System.out.println("Number of doors should be between 0 and 10");
            return -1;
        }
    }
}

