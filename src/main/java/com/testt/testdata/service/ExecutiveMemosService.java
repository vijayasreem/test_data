package com.testt.testdata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testt.testdata.model.ExecutiveMemos;
import com.testt.testdata.repository.ExecutiveMemosRepository;

@Service
public class ExecutiveMemosService {
  
  @Autowired
  ExecutiveMemosRepository executiveMemosRepository;

  public ExecutiveMemos getMemo() {
    return executiveMemosRepository.getMemo();
  }
  
  public ExecutiveMemos getDateCreated() {
    return executiveMemosRepository.getDateCreated();
  }
  
  public ExecutiveMemos getDow() {
    return executiveMemosRepository.getDow();
  }
  
  public ExecutiveMemos getDownloadData() {
    return executiveMemosRepository.getDownloadData();
  }
  
  public ExecutiveMemos getSubmit() {
    return executiveMemosRepository.getSubmit();
  }
  
  public ExecutiveMemos getReset() {
    return executiveMemosRepository.getReset();
  }
  
  public ExecutiveMemos getAccess() {
    return executiveMemosRepository.getAccess();
  }
  
  public ExecutiveMemos getLoginPage() {
    return executiveMemosRepository.getLoginPage();
  }
  
  public List<ExecutiveMemos> getAll() {
    return executiveMemosRepository.findAll();
  }
  
  public Optional<ExecutiveMemos> get(Long id) {
    return executiveMemosRepository.findById(id);
  }
  
  public ExecutiveMemos save(ExecutiveMemos executiveMemos) {
    return executiveMemosRepository.save(executiveMemos);
  }
  
  public void delete(Long id) {
    executiveMemosRepository.deleteById(id);
  }
  
}