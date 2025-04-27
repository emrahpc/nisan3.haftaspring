package com.acunmedyaJfsr1.BootCampProjects1.repository;

import com.acunmedyaJfsr1.BootCampProjects1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
