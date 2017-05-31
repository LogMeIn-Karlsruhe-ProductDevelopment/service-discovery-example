package com.supercars.vehiclefleetmanagement;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.supercars.vehiclefleetmanagement.domain.CarAvailability;
import com.supercars.vehiclefleetmanagement.domain.CarClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarAvailabilityController {

    @GetMapping(path="/cars/availability")
    public List<CarAvailability> checkAvailableCars(@RequestParam(name = "city") String requestedCity) {
        return Collections.singletonList(new CarAvailability(randomAmount(), CarClass.STANDARD));
    }

    private int randomAmount() {
        Random random = new Random();
        return random.nextInt(19) + 1;
    }
}
