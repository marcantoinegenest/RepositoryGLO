package domain;

import java.util.UUID;

public class OilChange {
    private UUID carId;
    private String changedAtDate;
    private String changedAtMileage;

    public OilChange(UUID carId, String changedAtDate, String changedAtMileage) {
        this.carId = carId;
        this.changedAtDate = changedAtDate;
        this.changedAtMileage = changedAtMileage;
    }
}
