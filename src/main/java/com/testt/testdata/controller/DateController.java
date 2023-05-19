package com.testt.testdata.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testt.testdata.service.DateService;

@RestController
@RequestMapping("/dates")
public class DateController {

    @Autowired
    private DateService dateService;

    @GetMapping("/{month}/{year}")
    public Date getDateByMonthAndYear(@PathVariable String month, @PathVariable int year) {
        return dateService.getDateByMonthAndYear(month, year);
    }

    @GetMapping("/between/{startDate}/{endDate}")
    public List<Date> getDatesBetween(@PathVariable LocalDate startDate, @PathVariable LocalDate endDate) {
        return dateService.getDatesBetween(startDate, endDate);
    }

    @GetMapping("/bydate/{date}")
    public Date getDateByDate(@PathVariable LocalDate date) {
        return dateService.getDateByDate(date);
    }

    @GetMapping("/bymonth/{month}")
    public List<Date> getDatesByMonth(@PathVariable String month) {
        return dateService.getDatesByMonth(month);
    }

    @GetMapping("/byyear/{year}")
    public List<Date> getDatesByYear(@PathVariable int year) {
        return dateService.getDatesByYear(year);
    }

}