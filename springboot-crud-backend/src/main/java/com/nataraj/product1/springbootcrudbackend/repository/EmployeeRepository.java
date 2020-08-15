package com.nataraj.product1.springbootcrudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nataraj.product1.springbootcrudbackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
