package com.danielk.dyplomowanie.Repository;

import com.danielk.dyplomowanie.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {}