package but.spring.airline.api;

import but.spring.airline.model.Employee;
import but.spring.airline.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController  {
    private final EmployeeService employeeService;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getEmployees(){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployees());
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable String id){
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
    }

    @PostMapping("/employee/save")
    public ResponseEntity<Employee> saveEmployee(Employee e){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path(("/api/employee/save")).toUriString());
        return ResponseEntity.created(uri).body(employeeService.saveEmployee(e));
    }
}
