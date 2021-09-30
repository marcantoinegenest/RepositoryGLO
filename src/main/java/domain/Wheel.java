package domain;

import java.util.UUID;

public class Wheel {
    private UUID carId;
    private String serialNumber;
    private String brand;
    private String model;
    private String size;
    private String position;
    private int mileageInstallation;

    public Wheel(UUID carId, String serialNumber, String brand, String model, String size, String position, int mileageInstallation) {
        this.carId = carId;
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.position = position;
        this.mileageInstallation = mileageInstallation;
    }

    public String getPosition() {
        return this.position;
    }
}
