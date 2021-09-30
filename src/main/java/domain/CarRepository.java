package domain;

import java.util.Map;
import java.util.UUID;

public interface CarRepository {
    void save(Car car);
    Car getById(UUID id);
}
