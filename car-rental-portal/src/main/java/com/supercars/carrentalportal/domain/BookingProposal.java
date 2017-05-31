package com.supercars.carrentalportal.domain;

import com.supercars.carrentalportal.fleetconnector.CarAvailability;

public class BookingProposal {
    private Double price;
    private CarAvailability.CarClass carClass;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CarAvailability.CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarAvailability.CarClass carClass) {
        this.carClass = carClass;
    }
}
