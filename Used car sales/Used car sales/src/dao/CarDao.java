package dao;

import java.util.List;

import models.Car;

public interface CarDao {
public abstract int addCar(Car car);
public abstract Car searchCar(int id);
public abstract List<Car> getAllCars();
public abstract void deleteCar(int id);
public abstract int updateCar(Car car);
}
