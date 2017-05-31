package com.supercars.carrentalportal.fleetconnector;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="fleet-management")
public interface FleetClient {

    @RequestMapping(path = "/cars/availability?city={requestedCity}", method = RequestMethod.GET)
    List<CarAvailability> getAvailableCarsFor(@PathVariable(name = "requestedCity") String city);
}
