package com.practice.exercises;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/holidays")
public class HolidayzerController {

    Holidayzer holidayzer = new Holidayzer();

    @GetMapping()
    public String getAllHolidays() {
        return holidayzer.getAllHolidays();
    }

    @GetMapping("/{date}")
    public String checkHoliday(@PathVariable String date) {
        return holidayzer.getHoliday(date);
    }    
    
}
