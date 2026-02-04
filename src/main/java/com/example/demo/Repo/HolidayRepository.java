package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {
}
