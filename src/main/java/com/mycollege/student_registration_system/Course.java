/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycollege.student_registration_system;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andy
 */
public class Course {
    
    private String CourseName;
    private ArrayList<Module> Modules = new ArrayList<Module>();
    private Date StartDate = new Date();
    private Date EndDate = new Date();
    
    public Course(String course_name, ArrayList<Module> modules, Date startDate, Date endDate){
        this.setCourseName(course_name);
        this.setModules(modules);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
    
    }

    private String setCourseName(String course_name) {
        return this.CourseName = course_name;
    }
    
    private String getCourseName() {
        return this.CourseName;
    }

    private ArrayList<Module> setModules(ArrayList<Module> modules) {
        return this.Modules = modules;
    }
    
    private ArrayList<Module> getModules() {
        return this.Modules;
    }

    private Date setStartDate(Date startDate) {
        return this.StartDate = startDate;
    }
    
    private Date getStartDate() {
        return this.StartDate;
    }

    private Date setEndDate(Date endDate) {
        return this.EndDate = endDate; 
    }
    
    private Date getEndDate() {
        return this.EndDate; 
    }
    
}
