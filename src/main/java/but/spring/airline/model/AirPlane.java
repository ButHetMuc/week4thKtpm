package but.spring.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirPlane {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id;
    private String type;
    private String heightFlight;

    @OneToMany(fetch = FetchType.EAGER)
    private Collection<Flight> flights = new ArrayList<>();
}
