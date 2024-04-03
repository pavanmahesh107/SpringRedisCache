package dev.pavan.springrediscache.service;

import dev.pavan.springrediscache.model.Car;

import java.util.List;

public interface CarService {

    //Get all the cars
    List<Car> getAllCars();
    //Get specific car
    Car getcar(int id);
    //save the car
    Car saveCar(Car car);
}
