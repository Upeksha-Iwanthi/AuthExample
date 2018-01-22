package com.example.demo.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class ClassModificationHistory {

    @Id
    @GeneratedValue
    private long id;

    private String classpath;

    private String jiraIssueId;

    private long revision;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClasspath() {
        return classpath;
    }

    public void setClasspath(String classpath) {
        this.classpath = classpath;
    }

    public String getJiraIssueId() {
        return jiraIssueId;
    }

    public void setJiraIssueId(String jiraIssueId) {
        this.jiraIssueId = jiraIssueId;
    }

    public long getRevision() {
        return revision;
    }

    public void setRevision(long revision) {
        this.revision = revision;
    }
}

