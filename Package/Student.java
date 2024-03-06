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
class Student extends Person implements Comparable<Student>{
    
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses;
    
    
    /**
     * Student Constructor
     * @param fName String
     * @param lName String
     * @param id int
     * @param major String
     * @param gpa double
     * @param credits int
     */
    public Student (String fName, String lName, int id, String major, 
                   double gpa, int credits){
        super(fName, lName, id);
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
        balance = 0;
        enrolledCourses = new ArrayList();
    }
    
    //Getter Methods
    
    
    /**
     * 
     * @return String Getter for Major
     */
    public String getMajor(){
        return major;
    } 
    
    /**
     * 
     * @return double Getter for GPA
     */
    public double getGPA(){
        return gpa;
    }
    
    /**
     * 
     * @return int Getter for Credits
     */
    public int getCredits(){
        return credits;
    }
    
    /**
     * 
     * @return Boolean Getter for Transfer
     */
    public boolean isTransfer(){
        return transfer;
    }
    
    /**
     * 
     * @return double Getter for Balance
     */
    public double getBalance(){
        return balance;
    }
    
    /**
     * 
     * @return ArrayList Getter for Enrolled Courses
     */
    public ArrayList<String> getEnrolledCourses(){
        return enrolledCourses;
    }
    
    
    //Setter Methods
    
    
    /**
     * 
     * @param major Sets name Major
     */
    public void setMajor(String major){
        this.major = major;
    }
    
    /**
     * 
     * @param gpa Sets new GPA
     */
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    
    /**
     * 
     * @param credits Sets new Credits
     */
    public void setCredits(int credits){
        this.credits = credits;
    }
    
    /**
     * 
     * @param transfer Sets new Transfer
     */
    public void setTransfer(boolean transfer){
        this.transfer = transfer;
    }
    
    /**
     * 
     * @param balance Sets new Balance
     */
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    /**
     * 
     * @param course Adds new Course
     */
    public void addCourse(String course){
        enrolledCourses.add(course);
    }
    
    /**
     * 
     * @param course Removes selected course from ArrayList
     * @return Boolean
     */
    public boolean dropCourse(String course){
       return enrolledCourses.remove(course);
    }
    
    
    
    //Module 7 - Part A
    
    @Override
    public void display(){
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName() +
                           "\n ID #: " + this.getId() + "\nMajor: " + this.major + "\nCredits: "  + this.credits + "\nGPA: " + gpa);
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < enrolledCourses.size(); i++) {
            System.out.println("\t" + enrolledCourses.get(i));
        }
    }
    
    @Override
    public String toString(){
        return "Student - " + this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public int compareTo(Student o) {
        
        double sGPA = this.getGPA();
        double oGPA = o.getGPA();
        
        System.out.println("Students GPA: " +sGPA + " and " + oGPA);
        
        if(sGPA > oGPA){
            return 1;
        }else if(oGPA > sGPA){
            return -1;
        }else{
            return 0;
        }
        
        
        
    }
    
    
        
}
