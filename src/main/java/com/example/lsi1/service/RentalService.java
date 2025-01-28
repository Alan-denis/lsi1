package com.example.lsi1.service;

import org.springframework.stereotype.Service;

@Service
public class RentalService {

    public RentalService(){

    }

    public void rent(String plateNumber) throws CarNotFoundException {
        throw new CarNotFoundException((plateNumber));
    }

}
