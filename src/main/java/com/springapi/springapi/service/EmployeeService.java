package com.springapi.springapi.service;

import com.springapi.springapi.dto.EmployeeDto;
import com.springapi.springapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    List<Employee> findByFirstName(String name);
    Iterable<Employee> findAllRecord();
    Iterable<Employee> findRecordByFirstName(String name);
}
