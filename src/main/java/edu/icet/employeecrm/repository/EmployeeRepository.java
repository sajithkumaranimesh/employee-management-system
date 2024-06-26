package edu.icet.employeecrm.repository;
import edu.icet.employeecrm.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long>{
    EmployeeEntity findByFirstName(String firstName);
}
