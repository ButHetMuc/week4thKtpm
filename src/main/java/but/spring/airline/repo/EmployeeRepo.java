package but.spring.airline.repo;

import but.spring.airline.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,String> {
    Employee findByName(String empName);
}
