package dev.pavan.springrediscache.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;

    private String brand;

    private String model;
}
