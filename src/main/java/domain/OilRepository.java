package domain;

public interface OilRepository {
    void save(OilChange oilChange);
    OilChange findById();
}
