package dev.pavan.springrediscache.controller;

import dev.pavan.springrediscache.model.Car;
import dev.pavan.springrediscache.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car/{id}")
    public ResponseEntity getCar(@PathVariable("id") int id) {
        return ResponseEntity.ok(
                carService.getcar(id)
        );

    }
        @GetMapping("/car")
        public ResponseEntity getAllCars(){
            return ResponseEntity.ok(
                    carService.getAllCars()
            );
        }

        @PostMapping("/car")
        public ResponseEntity saveCar(@RequestBody Car car){
        return ResponseEntity.ok(
                carService.saveCar(car)
        );
        }
    }

