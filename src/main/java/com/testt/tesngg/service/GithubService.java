package com.testt.tesngg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testt.tesngg.model.Github;
import com.testt.tesngg.repository.GithubRepository;

@Service
public class GithubService {

  @Autowired
  private GithubRepository githubRepository;

  public Boolean authenticateWithGitRepositories(String credentials) {
    return githubRepository.authenticateWithGitRepositories(credentials);
  }

  public Boolean updateExistingFiles(String fileName) {
    return githubRepository.updateExistingFiles(fileName);
  }

  public Boolean commitMultipleFiles(String[] files) {
    return githubRepository.commitMultipleFiles(files);
  }

  public String handleGitApiExceptions(String errors) {
    return githubRepository.handleGitApiExceptions(errors);
  }

  public List<Github> findAll() {
    return githubRepository.findAll();
  }
}