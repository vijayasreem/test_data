package com.testt.testdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "executive_memos")
public class ExecutiveMemos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "memo")
    private String memo;
    
    @Column(name = "date_created")
    private String dateCreated;
    
    @Column(name = "dow")
    private String dow;
    
    @Column(name = "download_data")
    private String downloadData;
    
    @Column(name = "submit")
    private String submit;
    
    @Column(name = "reset")
    private String reset;
    
    @Column(name = "access")
    private String access;
    
    @Column(name = "login_page")
    private String loginPage;
    
    public ExecutiveMemos() {
        
    }
    
    public ExecutiveMemos(String memo, String dateCreated, String dow, String downloadData, String submit, String reset, String access, String loginPage) {
        this.memo = memo;
        this.dateCreated = dateCreated;
        this.dow = dow;
        this.downloadData = downloadData;
        this.submit = submit;
        this.reset = reset;
        this.access = access;
        this.loginPage = loginPage;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getMemo() {
        return memo;
    }
    
    public void setMemo(String memo) {
        this.memo = memo;
    }
    
    public String getDateCreated() {
        return dateCreated;
    }
    
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public String getDow() {
        return dow;
    }
    
    public void setDow(String dow) {
        this.dow = dow;
    }
    
    public String getDownloadData() {
        return downloadData;
    }
    
    public void setDownloadData(String downloadData) {
        this.downloadData = downloadData;
    }
    
    public String getSubmit() {
        return submit;
    }
    
    public void setSubmit(String submit) {
        this.submit = submit;
    }
    
    public String getReset() {
        return reset;
    }
    
    public void setReset(String reset) {
        this.reset = reset;
    }
    
    public String getAccess() {
        return access;
    }
    
    public void setAccess(String access) {
        this.access = access;
    }
    
    public String getLoginPage() {
        return loginPage;
    }
    
    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }
}