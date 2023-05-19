package com.testt.testdata.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testt.testdata.repository.DateRepository;

@Service
public class DateService {
	
	@Autowired
	private DateRepository dateRepository;
	
	public Date getDateByMonthAndYear(String month, int year) {
		return dateRepository.getDateByMonthAndYear(month, year);
	}
	
	public List<Date> getDatesBetween(LocalDate startDate, LocalDate endDate) {
		return dateRepository.getDatesBetween(startDate, endDate);
	}
	
	public Date getDateByDate(LocalDate date) {
		return dateRepository.getDateByDate(date);
	}
	
	public List<Date> getDatesByMonth(String month) {
		return dateRepository.getDatesByMonth(month);
	}
	
	public List<Date> getDatesByYear(int year) {
		return dateRepository.getDatesByYear(year);
	}
	
}