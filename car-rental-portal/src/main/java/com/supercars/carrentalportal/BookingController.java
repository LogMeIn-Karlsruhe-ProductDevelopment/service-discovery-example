package com.supercars.carrentalportal;

import java.util.List;
import java.util.Optional;

import com.supercars.carrentalportal.domain.BookingProposal;
import com.supercars.carrentalportal.fleetconnector.CarAvailability;
import com.supercars.carrentalportal.fleetconnector.FleetClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BookingController {

    private FleetClient fleetClient;

    @Autowired
    public BookingController(FleetClient fleetClient) {
        this.fleetClient = fleetClient;
    }

    @GetMapping(path = "bookings/propose")
    public BookingProposal propose() {

        List<CarAvailability> availableCars = fleetClient.getAvailableCarsFor("Karlsruhe");
        Optional<CarAvailability> proposedCarAvailability = availableCars.stream().findFirst();

        if(proposedCarAvailability.isPresent()) {
            BookingProposal proposal = new BookingProposal();
            proposal.setCarClass(proposedCarAvailability.get().getCarClass());
            proposal.setPrice(100.0);

            return proposal;
        } else {
            throw new NotFoundException();
        }
    }
}
