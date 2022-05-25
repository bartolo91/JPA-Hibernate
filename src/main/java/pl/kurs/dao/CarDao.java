package pl.kurs.dao;

import pl.kurs.model.Car;

public interface CarDao {

    void save(Car car);

    Car getCar(Long id);

    void cleanUp();
}
