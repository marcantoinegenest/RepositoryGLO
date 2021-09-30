package infrastructure;

import domain.Car;
import domain.CarRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CarRepositoryImpl implements CarRepository {
    Map<UUID, Car> carRepository = new HashMap<>();

    @Override
    public void save(Car car) {

    }

    @Override
    public Car getById(UUID id) {
        return carRepository.get(id);
    }

}
