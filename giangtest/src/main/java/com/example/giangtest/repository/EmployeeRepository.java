package com.example.giangtest.repository;

import com.example.giangtest.entity.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, String> {
//    @Query("select e from Employees e where e.id like %:key%")
//    Iterable<Employees> search(@Param("key")String key);
}
