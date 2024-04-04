package dev.pavan.springrediscache.service;

import dev.pavan.springrediscache.model.Car;
import dev.pavan.springrediscache.repository.CarRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Getter
@Setter
public class CarServiceimpl implements CarService{

    private CarRepository carRepository;

    //Constructor Injection
    public CarServiceimpl(CarRepository carRepository) {

        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getcar(int id) {
        Optional<Car> optionalCar = carRepository.findById(id);
        return optionalCar.get();
    }

    @Override
    public Car saveCar(Car car) {
       Car savedCar = carRepository.save(car);
        return savedCar;
    }
}
