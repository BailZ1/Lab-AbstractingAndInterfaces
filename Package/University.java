/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.*;

/**
 *
 * @author baile
 */
public class University implements UniversitySpecification{
    private ArrayList<Person> personnel = new ArrayList();
    private String name = "";
    
    public University(String name){
        this.name = name;
    }
    
    public ArrayList<Person> getPersonnel(){
        return personnel;
    }

    @Override
    public void setUp(ArrayList<Person> personnel) {
        this.personnel = personnel; 
    }

    @Override
    public ArrayList<Student> getStudents() {
        ArrayList<Student> s = new ArrayList();
        for(Person student : personnel){
            if(student instanceof Student){
                s.add((Student)student);
            }
        }
        
        return s;
    }

    @Override
    public ArrayList<Professor> getProfessors() {
        ArrayList<Professor> p = new ArrayList();
        for(Person professor : personnel){
            if(professor instanceof Professor){
                p.add((Professor)professor);
            }
        }
        
        return p;
    }

    @Override
    public void newStudent(Student s) {
        personnel.add(s);
    }

    @Override
    public void newProfessor(Professor p) {
        personnel.add(p);
    }
    
    
    
}
