package com.libreriaNewton.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libreriaNewton.entity.Libreria;

@Repository

public interface BookRepository extends JpaRepository<Libreria, Integer>{

}
