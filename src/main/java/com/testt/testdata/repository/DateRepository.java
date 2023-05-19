·       Ability to select the date, month and year in the calendar.·       All the selected date should be displayed as per selection done by user.

package com.testt.testdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DateRepository extends JpaRepository<Date, Long> {
	
	@Query("SELECT d FROM Date d WHERE d.month = :month AND d.year = :year")
	Date getDateByMonthAndYear(String month, int year);
	
	@Query("SELECT d FROM Date d WHERE d.date BETWEEN :startDate AND :endDate")
	List<Date> getDatesBetween(LocalDate startDate, LocalDate endDate);
	
	@Query("SELECT d FROM Date d WHERE d.date = :date")
	Date getDateByDate(LocalDate date);
	
	@Query("SELECT d FROM Date d WHERE d.month = :month")
	List<Date> getDatesByMonth(String month);
	
	@Query("SELECT d FROM Date d WHERE d.year = :year")
	List<Date> getDatesByYear(int year);
}