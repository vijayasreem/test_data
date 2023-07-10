package com.testt.tesngg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GithubRepository extends JpaRepository<Github, Long> {
 
  Boolean authenticateWithGitRepositories(String credentials);
  
  Boolean updateExistingFiles(String fileName);
  
  Boolean commitMultipleFiles(String[] files);
  
  String handleGitApiExceptions(String errors);
 
}