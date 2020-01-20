package com.danielk.dyplomowanie.Repository;

import com.danielk.dyplomowanie.Thesis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThesisRepository extends CrudRepository<Thesis, Long> {}