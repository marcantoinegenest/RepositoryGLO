package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Car {
    private UUID id;
    private String serialNumber;
    private String brand;
    private String model;
    private String year;
    private int mileage;

    private List<Wheel> wheels;
    private List<OilChange> oilChanges;

    public Car(String serialNumber, String brand, String model, String year, int mileage, List<Wheel> wheels) {
        this.id = UUID.randomUUID();
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.wheels = wheels;
    }

    public List<Wheel> leftWheels() {
        List<Wheel> leftWheels = new ArrayList<>();

        for (Wheel wheel : wheels) {
            if (wheel.getPosition().contains("Left")) {
                leftWheels().add(wheel);
            }
        }

        return leftWheels;
    }

    public List<Wheel> rightWheels() {
        List<Wheel> rightWheels = new ArrayList<>();

        for (Wheel wheel : wheels) {
            if (wheel.getPosition().contains("Right")) {
                rightWheels().add(wheel);
            }
        }

        return rightWheels;
    }
}
