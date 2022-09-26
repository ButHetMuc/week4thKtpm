package but.spring.airline.service;

import but.spring.airline.model.AirPlane;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AirplaneService {
    public AirPlane saveAirplane(AirPlane plane);
    public AirPlane getAirplane(String name);
    public AirPlane getById(String id);
    public List<AirPlane> getAirplanes();
}
