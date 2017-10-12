/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycollege.student_registration_system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andy
 */
public class Module {
    
    private String Module;
    private String ModuleID;
    private ArrayList<String> Students = new ArrayList<String>(); 
    
    public Module(String module, String moduleid, ArrayList<String> students){
        this.setModule(module);
        this.setModuleID(moduleid);
        this.setStudents(students);
    
    }

    private String setModule(String module) {
        return this.Module = module;
    }
    
    private String getModule() {
        return this.Module;
    }

    private String setModuleID(String moduleid) {
        return this.ModuleID = moduleid;
    }
    
    private String getModuleID(String moduleid) {
        return this.ModuleID;
    }

    private ArrayList<String> setStudents(ArrayList<String> students) {
        return this.Students = students;
    }
    
    private ArrayList<String> getStudents(){
        return this.Students;
    }
    
    
    
}
