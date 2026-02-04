package com.example.demo.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Holiday;
import com.example.demo.Repo.HolidayRepository;

@Service
public class HolidayService {

    private final HolidayRepository holidayRepository;

    public HolidayService(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    public List<Holiday> getAllHolidays() {
        return holidayRepository.findAll();
    }
}
