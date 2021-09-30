package domain;

public interface WheelRepository {
    void save(OilChange oilChange);
    OilChange findById();
}
