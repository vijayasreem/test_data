package com.testt.testdata.controller;

import com.testt.testdata.entity.ExecutiveMemo;
import com.testt.testdata.service.ExecutiveMemoRepoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/executiveMemo")
public class ExecutiveMemoController {

    @Autowired
    private ExecutiveMemoRepoService executiveMemoRepoService;

    @GetMapping("/memoNotNull")
    public List<ExecutiveMemo> getByMemoNotNull(){
        return this.executiveMemoRepoService.findByMemoNotNull();
    }

    @GetMapping("/dateCreatedNotNull")
    public List<ExecutiveMemo> getByDateCreatedNotNull(){
        return this.executiveMemoRepoService.findByDateCreatedNotNull();
    }

    @GetMapping("/dowNotNull")
    public List<ExecutiveMemo> getByDowNotNull(){
        return this.executiveMemoRepoService.findByDowNotNull();
    }

    @GetMapping("/memoAndDateAndDow")
    public ExecutiveMemo getByMemoAndDateCreatedAndDow(@RequestParam(value = "memo") String memo,
                                                      @RequestParam(value = "dateCreated") Date dateCreated,
                                                      @RequestParam(value = "dow") int dow){
        return this.executiveMemoRepoService.findByMemoAndDateCreatedAndDow(memo, dateCreated, dow);
    }

    @GetMapping("/allValidMemos")
    public List<ExecutiveMemo> getAllValidMemos(){
        return this.executiveMemoRepoService.findAllValidMemos();
    }

    @GetMapping("/allValidDateCreated")
    public List<ExecutiveMemo> getAllValidDateCreated(){
        return this.executiveMemoRepoService.findAllValidDateCreated();
    }

    @GetMapping("/allValidDow")
    public List<ExecutiveMemo> getAllValidDow(){
        return this.executiveMemoRepoService.findAllValidDow();
    }

    @GetMapping("/allValidData")
    public List<ExecutiveMemo> getAllValidData(){
        return this.executiveMemoRepoService.findAllValidData();
    }

    @DeleteMapping("/deleteByMemo/{memo}")
    public ResponseEntity<Void> deleteByMemo(@PathVariable("memo") String memo) {
        this.executiveMemoRepoService.deleteByMemo(memo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}