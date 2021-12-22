package com.example.practiceassignment.repository;

import com.example.practiceassignment.model.Nation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INationRepository extends JpaRepository<Nation,Long> {
}
