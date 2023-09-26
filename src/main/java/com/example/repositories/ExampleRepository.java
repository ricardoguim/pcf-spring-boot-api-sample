package com.example.repositories;

import com.example.models.ExampleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<ExampleModel, Long> {
    // This file intentionally left blank
}