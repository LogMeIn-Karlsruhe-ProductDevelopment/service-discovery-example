package com.supercars.carrentalportal.fleetconnector;

public class CarAvailability {
    private Integer amount;
    private CarClass carClass;

    public CarAvailability() {
    }

    public CarAvailability(Integer amount, CarClass carClass) {
        this.amount = amount;
        this.carClass = carClass;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public enum CarClass {
        STANDARD,
        PREMIUM
    }
}
