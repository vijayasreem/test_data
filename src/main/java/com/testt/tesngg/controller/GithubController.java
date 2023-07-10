package com.testt.tesngg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testt.tesngg.model.Github;
import com.testt.tesngg.service.GithubService;

@RestController
public class GithubController {
  @Autowired
  private GithubService githubService;

  @PostMapping("/authenticateWithGitRepositories")
  public Boolean authenticateWithGitRepositories(@RequestParam String credentials) {
    return githubService.authenticateWithGitRepositories(credentials);
  }

  @PostMapping("/updateExistingFiles")
  public Boolean updateExistingFiles(@RequestParam String fileName) {
    return githubService.updateExistingFiles(fileName);
  }

  @PostMapping("/commitMultipleFiles")
  public Boolean commitMultipleFiles(@RequestBody String[] files) {
    return githubService.commitMultipleFiles(files);
  }

  @PostMapping("/handleGitApiExceptions")
  public String handleGitApiExceptions(@RequestParam String errors) {
    return githubService.handleGitApiExceptions(errors);
  }

  @GetMapping("/findAll")
  public List<Github> findAll() {
    return githubService.findAll();
  }
}