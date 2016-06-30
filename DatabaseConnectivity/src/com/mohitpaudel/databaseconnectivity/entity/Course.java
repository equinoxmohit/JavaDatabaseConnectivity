/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.databaseconnectivity.entity;

import java.util.Date;

/**
 *
 * @author Mohit
 */
public class Course {
    private int course_id;
    private String course_name,course_description;
    private int duration;
    private String duration_type;
    private int fees;
    private Date added_date,modified_date;
    private boolean status;

    public Course() {
    }

    public Course(int course_id, String course_name, String course_description, int duration, String duration_type, int fees, boolean status) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_description = course_description;
        this.duration = duration;
        this.duration_type = duration_type;
        this.fees = fees;
        this.status = status;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDuration_type() {
        return duration_type;
    }

    public void setDuration_type(String duration_type) {
        this.duration_type = duration_type;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public Date getAdded_date() {
        return added_date;
    }

    public void setAdded_date(Date added_date) {
        this.added_date = added_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" + "course_id=" + course_id + ", course_name=" + course_name + ", course_description=" + course_description + ", duration=" + duration + ", duration_type=" + duration_type + ", fees=" + fees + ", added_date=" + added_date + ", modified_date=" + modified_date + ", status=" + status + '}';
    }
    
    
    
    
    
}
