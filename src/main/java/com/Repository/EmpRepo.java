package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
