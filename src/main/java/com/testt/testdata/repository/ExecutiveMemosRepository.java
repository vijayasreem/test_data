package com.testt.testdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.testt.testdata.model.ExecutiveMemos;

@Repository
public interface ExecutiveMemosRepository extends JpaRepository<ExecutiveMemos, Long> { 
 
  @Query("SELECT e FROM ExecutiveMemos e WHERE e.memo IS NOT NULL")
  ExecutiveMemos getMemo();

  @Query("SELECT e FROM ExecutiveMemos e WHERE e.dateCreated IS NOT NULL")
  ExecutiveMemos getDateCreated();

  @Query("SELECT e FROM ExecutiveMemos e WHERE e.dow IS NOT NULL")
  ExecutiveMemos getDow();
  
  @Query("SELECT e FROM ExecutiveMemos e WHERE e.downloadData IS NOT NULL")
  ExecutiveMemos getDownloadData();
  
  @Query("SELECT e FROM ExecutiveMemos e WHERE e.submit IS NOT NULL")
  ExecutiveMemos getSubmit();
  
  @Query("SELECT e FROM ExecutiveMemos e WHERE e.reset IS NOT NULL")
  ExecutiveMemos getReset();
  
  @Query("SELECT e FROM ExecutiveMemos e WHERE e.access IS NOT NULL")
  ExecutiveMemos getAccess();
  
   @Query("SELECT e FROM ExecutiveMemos e WHERE e.loginPage IS NOT NULL")
  ExecutiveMemos getLoginPage();
  
  void deleteById(Long id);
}