package com.example.lsi1.service;

import com.example.lsi1.data.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    List<Car> cars = new ArrayList<Car>();

    public CarService(){
        cars.add( new Car("AA11BB", "Ferrari", 1000));
        cars.add( new Car("BB22CC", "Porsche", 2000));
        cars.add( new Car("CC44DD", "Peugeot", 400));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void rent(String plateNumber) throws CarNotFoundException {
        throw new CarNotFoundException((plateNumber));
    }

}
