package com.springapi.springapi.controller;


import com.springapi.springapi.dto.EmployeeDto;
import com.springapi.springapi.model.Employee;
import com.springapi.springapi.repository.EmployeeRepository;
import com.springapi.springapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/findRecordByName")
    public Iterable<Employee> findRecord(@RequestParam("name") String name){
        return employeeService.findRecordByFirstName(name);
    }

    @GetMapping
    public Iterable<Employee> fetchAll(){
        return employeeService.findAllRecord();
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto saveEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> findRecordByName(@RequestParam("name") String name){
        try {
            List<Employee> employees = new ArrayList<>();
            if(name != null){
                employeeService.findByFirstName(name).forEach(employees::add);
            }else{
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(employees, HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String requestString(@RequestParam("name") String name){
        return "test data : " + name;
    }
}
