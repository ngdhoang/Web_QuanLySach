package com.hoangnd.web.repository;

import com.hoangnd.web.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	Author findByName(String name);
}

