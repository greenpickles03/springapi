package com.springapi.springapi.repository;

import com.springapi.springapi.model.Adventure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdventureRepository extends JpaRepository<Adventure, Integer> {
}
