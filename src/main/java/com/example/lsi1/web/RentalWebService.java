package com.example.lsi1.web;

import com.example.lsi1.data.Car;
import com.example.lsi1.data.Dates;
import com.example.lsi1.service.CarNotFoundException;
import com.example.lsi1.service.RentalService;
import com.example.lsi1.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RentalWebService {

    RentalService rentalService;
    CarService carService;
    Logger logger = LoggerFactory.getLogger(RentalWebService.class);

    @Autowired
    public RentalWebService(RentalService rentalService, CarService carService){
        this.rentalService = rentalService;
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> listOfCars(){
        return carService.getCars();
    }

    @PutMapping(value = "/cars/{plaque}")
    public void rent(
            @PathVariable("plaque") String plateNumber,
            @RequestParam(value="rent", required = true)boolean rent,
            @RequestBody Dates dates) throws CarNotFoundException {

        logger.info("PlateNumber: " + plateNumber);
        logger.info("Rent: " + rent);
        logger.info("Dates: " + dates);

        rentalService.rent(plateNumber);

    }

}
