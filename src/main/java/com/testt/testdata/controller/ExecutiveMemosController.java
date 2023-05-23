package com.testt.testdata.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testt.testdata.model.ExecutiveMemos;
import com.testt.testdata.service.ExecutiveMemosService;

@RestController
@RequestMapping("/executiveMemos")
public class ExecutiveMemosController {
  
  @Autowired
  ExecutiveMemosService executiveMemosService;
  
  @GetMapping("/memo")
  public ExecutiveMemos getMemo() {
    return executiveMemosService.getMemo();
  }
  
  @GetMapping("/dateCreated")
  public ExecutiveMemos getDateCreated() {
    return executiveMemosService.getDateCreated();
  }
  
  @GetMapping("/dow")
  public ExecutiveMemos getDow() {
    return executiveMemosService.getDow();
  }
  
  @GetMapping("/downloadData")
  public ExecutiveMemos getDownloadData() {
    return executiveMemosService.getDownloadData();
  }
  
  @GetMapping("/submit")
  public ExecutiveMemos getSubmit() {
    return executiveMemosService.getSubmit();
  }
  
  @GetMapping("/reset")
  public ExecutiveMemos getReset() {
    return executiveMemosService.getReset();
  }
  
  @GetMapping("/access")
  public ExecutiveMemos getAccess() {
    return executiveMemosService.getAccess();
  }
  
  @GetMapping("/loginPage")
  public ExecutiveMemos getLoginPage() {
    return executiveMemosService.getLoginPage();
  }
  
  @GetMapping
  public List<ExecutiveMemos> getAll() {
    return executiveMemosService.getAll();
  }
  
  @GetMapping("/{id}")
  public Optional<ExecutiveMemos> get(@PathVariable Long id) {
    return executiveMemosService.get(id);
  }
  
  @PostMapping
  public ExecutiveMemos save(@RequestBody ExecutiveMemos executiveMemos) {
    return executiveMemosService.save(executiveMemos);
  }
  
  @PutMapping
  public ExecutiveMemos update(@RequestBody ExecutiveMemos executiveMemos) {
    return executiveMemosService.save(executiveMemos);
  }
  
  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    executiveMemosService.delete(id);
  }
  
}