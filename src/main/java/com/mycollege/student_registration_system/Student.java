/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycollege.student_registration_system;

import java.util.Date;

/**
 *
 * @author Andy
 */
public class Student {
    
    private String Name;
    private int Age;
    private String DOB;
    private int ID;
    private String Username;
    
    public Student(String name, int age, int id, String dob){
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setDob(dob);
        
    }
    
    public String getUsername(){
        
        return this.Username = this.Name + this.Age;
        
    }
    
    		public String getName() {
			return this.Name;
		}

		public void setName(String name) {
			this.Name = name;
		}

		public void setDob(String dob) {
			this.DOB = dob;
		}
		public String getDob() {
			return this.DOB;
		}
		public void setAge(int age) {
			this.Age = age;
		}
		public int getAge() {
			return this.Age;
		}
       		public void setId(int id) {
			this.ID = id;
		}
		public int getId() {
			return this.ID;
		}
}
