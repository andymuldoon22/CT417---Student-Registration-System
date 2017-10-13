/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycollege.student_registration_system;

import java.util.ArrayList;

/**
 *
 * @author Andy
 */
public class Module {
    
    private String Module;
    private String ModuleID;
    private ArrayList<Student> Students = new ArrayList<Student>(); 
    
    public Module(String module, String moduleid, ArrayList<Student> students){
        this.setModule(module);
        this.setModuleID(moduleid);
        this.setStudents(students);
    
    }

    public String setModule(String module) {
        return this.Module = module;
    }
    
    public String getModule() {
        return this.Module;
    }

    public String setModuleID(String moduleid) {
        return this.ModuleID = moduleid;
    }
    
    public String getModuleID(String moduleid) {
        return this.ModuleID;
    }

    public ArrayList<Student> setStudents(ArrayList<Student> students) {
        return this.Students = students;
    }
    
    public ArrayList<Student> getStudents(){
        return this.Students;
    }
    
    
    
}
