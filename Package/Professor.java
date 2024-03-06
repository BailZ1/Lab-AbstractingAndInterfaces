package Package;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author baile
 */

import java.util.*;

/**
 * 
 * @author baile
 */
class Professor extends Person implements Comparable<Professor> {
    
    private String department;
    private double salary;
    private ArrayList<Student> advisees = new ArrayList<>(100);
    
    /**
     * Professor Constructor
     * @param fName String
     * @param lName String
     * @param id int
     * @param department String
     * @param salary double
     */
    public Professor(String fName, String lName, int id, String department, double salary){
        super(fName, lName, id);
        this.department = department;
        this.salary = salary;
    }
    
    /**
     * Getter for Department
     * @return String
     */
    public String getDepartment(){
        return department;
    }
    
    /**
     * Getter for Salary
     * @return double
     */
    public double getSalary(){
        return salary;
    }
    
    /**
     * Getter for Advisees
     * @return ArrayList
     */
    public ArrayList<Student> getAdvisees(){
        return advisees;
    }
    
    /**
     * 
     * @param department Sets new Department
     */
    public void setDepartment(String department){
        this.department = department;
    }
    
    /**
     * 
     * @param salary Sets new Salary
     */
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    /**
     * 
     * @param student Adds new Advisee to ArrayList
     */
    public void addAdvisee(Student student){
        advisees.add(student);
    }
    
    /**
     * 
     * @param id Removes Advisee from ArrayList
     * @return Boolean Removes Advisee from ArrayList
     */
    public boolean removeAdvisee(int id){
        
        for (int i = 0; i < advisees.size(); i++) {
            if(advisees.get(i).getId() == id){
                advisees.remove(i);
                return true;
            }
        }
        return false;
    }
    
    //Module 7 - Part B
    
    @Override
    public void display(){
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName() + "\tID: " + this.getId());
        System.out.println("Department: " + department + "\tSalary: " + salary);
    }
    
    @Override
    public String toString(){
        return "Professor - " + this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public int compareTo(Professor o) {
        double salaryOne = o.getSalary();
        double salaryTwo = this.getSalary();
        
        if(salaryOne > salaryTwo){
            return -1;
        }else if(salaryOne < salaryTwo){
            return 1;
        }else{
            return 0;
        }
    }
    
    
}
