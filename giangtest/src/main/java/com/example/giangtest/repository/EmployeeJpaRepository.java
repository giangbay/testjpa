package com.example.giangtest.repository;

import com.example.giangtest.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepository extends JpaRepository<Employees, String> {
    
}
