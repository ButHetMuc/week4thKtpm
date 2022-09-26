package but.spring.airline.repo;

import but.spring.airline.model.AirPlane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepo extends JpaRepository<AirPlane,String> {
    public AirPlane getByName(String name);
}
