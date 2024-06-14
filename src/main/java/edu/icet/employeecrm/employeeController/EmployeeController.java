package edu.icet.employeecrm.employeeController;

import edu.icet.employeecrm.dto.Employee;
import edu.icet.employeecrm.entity.EmployeeEntity;
import edu.icet.employeecrm.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp-controller")

@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService service;

    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee) {
        service.addEmployee(employee);
    }


    @GetMapping("/get-all")
    public List<EmployeeEntity> getAll(){
        return service.getAll();
    }
}
