package com.CRUD.Operations.repository;

import com.CRUD.Operations.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students, Integer> {

}
