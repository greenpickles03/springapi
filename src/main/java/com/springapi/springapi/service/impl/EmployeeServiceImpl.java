package com.springapi.springapi.service.impl;



import com.springapi.springapi.dto.EmployeeDto;
import com.springapi.springapi.mapper.EmployeeMapper;
import com.springapi.springapi.model.Employee;
import com.springapi.springapi.repository.EmployeeRepository;
import com.springapi.springapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private final EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public List<Employee> findByFirstName(String name) {
        return employeeRepository.findByFirstName(name);
    }


}
