package com.example.giangtest.controller;

import com.example.giangtest.entity.Employees;
import com.example.giangtest.repository.EmployeeJpaRepository;
import com.example.giangtest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
//    @Autowired
//    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeJpaRepository employeeJpaRepository;
    @GetMapping(value = "/getlist")
    public Iterable<Employees> FindAllEmployees(){
        return employeeJpaRepository.findAll();
    }

    @PostMapping(value = "/create")
    public String createEmployee(@RequestBody Employees employees){
        employeeJpaRepository.save(employees);
        return "ok";
    }
}
