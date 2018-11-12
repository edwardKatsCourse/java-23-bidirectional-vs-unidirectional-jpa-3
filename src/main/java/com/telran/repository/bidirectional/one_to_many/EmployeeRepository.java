package com.telran.repository.bidirectional.one_to_many;

import com.telran.model.bidirectional.one_to_many.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
