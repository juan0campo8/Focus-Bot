package com.MM;

public class Task {
    private String title;
    private String description;
    private String duedate;
    private String priority;

    public Task(String title, String description, String category, String priority) {
        this.title = title;
        this.description = description;
        this.duedate = duedate;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}