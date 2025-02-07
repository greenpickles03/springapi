package com.springapi.springapi.repository;

import com.springapi.springapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository is an interface that provides access to data in a database
 */
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}