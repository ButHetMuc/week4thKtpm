package but.spring.airline.service;

import but.spring.airline.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Employee saveEmployee(Employee e);
    public Employee getEmployee(String empName);
    public Employee getEmployeeById(String id);
    public List<Employee> getEmployees();
}
