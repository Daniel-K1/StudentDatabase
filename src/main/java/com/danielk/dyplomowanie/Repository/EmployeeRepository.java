package com.danielk.dyplomowanie.Repository;

import com.danielk.dyplomowanie.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {}