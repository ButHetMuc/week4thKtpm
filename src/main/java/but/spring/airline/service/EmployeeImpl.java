package but.spring.airline.service;

import but.spring.airline.model.Employee;
import but.spring.airline.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class EmployeeImpl implements EmployeeService{
    private final EmployeeRepo employeeRepo;
    private static ArrayList<Employee> employees;

    @Override
    public Employee saveEmployee(Employee e) {
        log.info("saving employee",e.getName());
        return employeeRepo.save(e);
    }

    @Override
    public Employee getEmployee(String empName) {
        log.info("fetching employee: ",empName);
        return employeeRepo.findByName(empName);
    }

    @Override
    public Employee getEmployeeById(String id) {
        for (Employee employee: employees){
            if (employee.getId() == id)
                return employee;
        }
        return null ;
    }

    @Override
    public List<Employee> getEmployees() {
        log.info("fetching all employees");
        return employeeRepo.findAll();
    }
}
