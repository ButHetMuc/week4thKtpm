package but.spring.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String salary;

    @ManyToMany
    private List<AirPlane> certificates = new ArrayList<>();
}
