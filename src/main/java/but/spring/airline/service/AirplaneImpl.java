package but.spring.airline.service;

import but.spring.airline.model.AirPlane;
import but.spring.airline.repo.AirplaneRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service @RequiredArgsConstructor @Slf4j @Transactional
public class AirplaneImpl implements  AirplaneService{

    private final AirplaneRepo airplaneRepo;
    private static ArrayList<AirPlane> airPlanes;

    @Override
    public AirPlane saveAirplane(AirPlane plane) {
        log.info("saving airplane...");
        return airplaneRepo.save(plane);
    }

    @Override
    public AirPlane getAirplane(String name) {
        log.info("fetching airplane: ",name);
        return airplaneRepo.getByName(name);
    }

    @Override
    public AirPlane getById(String id) {
        log.info("fetching airplane has id: ",id);
        for (AirPlane plane: airPlanes){
            if (plane.getId().equals(id)){
                return plane;
            }
        }
        return null;
    }

    @Override
    public List<AirPlane> getAirplanes() {
        log.info("fetching all airplanes");
        return airplaneRepo.findAll();
    }
}
