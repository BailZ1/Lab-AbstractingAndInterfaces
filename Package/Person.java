package Package;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author baile
 */


public abstract class Person {
    
    private String firstName;
    private String lastName;
    private int id;
    
    
    /**
     * Person Constructor
     * @param firstName String
     * @param lastName String
     * @param id int
     */
    public Person(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    
    /**
     * Getter for First Name
     * @return String
     */
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * Getter for Last Name
     * @return String
     */
    public String getLastName(){
        return lastName;
    }
    
    /**
     * Getter for ID number
     * @return int
     */
    public int getId(){
        return id;
    }
    
    /**
     * Display Method
     */
    public abstract void display();

    int getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



