package com.testt.testdata.service;

import com.testt.testdata.entity.ExecutiveMemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ExecutiveMemoRepoService {

    List<ExecutiveMemo> findByMemoNotNull();

    List<ExecutiveMemo> findByDateCreatedNotNull();

    List<ExecutiveMemo> findByDowNotNull();

    ExecutiveMemo findByMemoAndDateCreatedAndDow(String memo, Date dateCreated, int dow);

    List<ExecutiveMemo> findAllValidMemos();

    List<ExecutiveMemo> findAllValidDateCreated();

    List<ExecutiveMemo> findAllValidDow();

    List<ExecutiveMemo> findAllValidData();

    void deleteByMemo(String memo);

}