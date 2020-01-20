package com.danielk.dyplomowanie.Repository;

import com.danielk.dyplomowanie.Keyword;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeywordRepository extends CrudRepository<Keyword, Long> {}