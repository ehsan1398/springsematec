package com.example.springsematec.repository;

import com.example.springsematec.model.kargar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface kargarRepository extends JpaRepository<kargar, Long> {

}
