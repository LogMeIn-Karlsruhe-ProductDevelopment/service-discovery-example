# Service discovery example
This is an example demonstrating service discovery using Spring Cloud Netflix integrations of Eureka and Ribbon.

The code is support for an talk held during a student event.

## Quickstart
To build and run the services, maven is required on your machine.
Simply execute the following commands in separate terminals to start the services:
```shell
cd service-registry && mvn spring-boot:run
cd car-rental-portal && mvn spring-boot:run
cd vehicle-fleet-management && spring-boot:run
```

## Project Structure
### car-rental-portal
Entrypoint to retrieve booking proposals. Proposals are available via http://localhost:8080/bookings/propose.
To offer an proposal, vehicle-fleet-management service is asked how many cars are currently available.

### vehicle-fleet-management
Provides information about the current availability of cars at a certain location.
Amount of currently available cars can be asked at http://localhost:8081/cars/availability?city=Karlsruhe. This Endpoint is used by the car-rental-portal.

### service-registry
Service-registry is the Spring-Cloud-Eureka service on which all services in the setup are registered. 
Clients like the car-rental-portal can ask how to connect to a certain service they want to request data from.

The Eureka UI is reachable at http://localhost:8761
Here you see a list of all currently registerd service instances.

## Resources
Documentation about the used components can be found at the following locations
- http://cloud.spring.io/spring-cloud-netflix/
- https://github.com/spring-cloud/spring-cloud-netflix/blob/master/docs/src/main/asciidoc/spring-cloud-netflix.adoc
- https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance