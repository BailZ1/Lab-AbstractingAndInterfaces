package Package;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
        System.out.println("*** Part A ***");
        
        Person p = new Person("Raya", "Whitaker", 800555555);
        p.display();
        
        System.out.println("*** Part B ***");
        
        Student s1 = new Student("Xavier", "Cat", 900111222, "CS", 3.5, 75);
        s1.setBalance(100);
        s1.setTransfer(true);
        s1.addCourse("Java Programming");
        s1.addCourse("Calculus");
        
        s1.display();
        
        if(s1.dropCourse("Spanish")){
            System.out.println("The class has been dropped");
        }else{
            System.out.println("You are not enrolled in this course. " + "No courses have been dropped");            
        }
        
        ArrayList<String> enrolledCourses = s1.getEnrolledCourses();
        System.out.println("You are enrolled in the following courses:");
        for(String course : enrolledCourses){
            System.out.println(course);
        }
        
        
        System.out.println("*** Part C ***");
        
        Student s2 = new Student("Katherine", "Johnson", 900, "CS", 4.0, 100);
        Student s3 = new Student("Roy", "Clay", 901, "Biology", 3.2, 85);
        Student s4 = new Student("Kimberly", "Bryant", 902, "EE", 3.0, 80);
        
        Professor prof1 = new Professor("Mary", "Castro", 300, "CS", 80000);
        
        prof1.addAdvisee(s2);
        prof1.addAdvisee(s3);
        prof1.addAdvisee(s4);
        
        prof1.display();
        
        if(prof1.removeAdvisee(902)){
            System.out.println("The advisee has been removed");
        }else{
            System.out.println("This student is not an advisee of Professor" + prof1.getFirstName() + " " + prof1.getLastName());
        }
        
        ArrayList<Student> myAdvisees = prof1.getAdvisees();
        System.out.println("Professor " + prof1.getFirstName() + " " + prof1.getLastName() + " advisees:");
        
        for (Student s : myAdvisees) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
        
        
        
        System.out.println("*** Part A ***");
        
        Student s1 = new Student("Xavier", "Cat", 900111222, "CS", 3.5, 75);
        s1.setBalance(100);
        s1.setTransfer(true);
        s1.addCourse("Java Programming");
        s1.addCourse("Calculus");
        
        s1.display();
        System.out.println("");
        System.out.println("*** Part B ***");
        
        
        
        
        
        prof1.addAdvisee(s2);
        prof1.addAdvisee(s3);
        prof1.addAdvisee(s4);
        
        prof1.display();
        
        System.out.println("");
        System.out.println("*** Part D ***");
        
        Person[] personArray = {s1, s2, prof1};
        
        ArrayList<Person> personList = new ArrayList();
        personList.add(s1);
        personList.add(s1);
        personList.add(prof1);
        
        System.out.println("Content of personList:");
        for(Person person: personList){
            System.out.println(person);
        }
        
        //           Lab Part 3
        
        System.out.println("");System.out.println("");System.out.println("");
        
        System.out.println("*** Part A ***");
        
        
        
        
        ArrayList<Person> contactList = new ArrayList();
        
        
        
        Professor prof2 = new Professor("Frank", "Balck", 801, "Math", 85000);
        contactList.add(prof2);
        
        Student s5 = new Student("Grace", "Maxeem", 903, "Psyhology", 3.4, 95);
        contactList.add(s5);
        
        for(Person people : contactList){
            people.display();
            System.out.println("");
        }
        
        
        //Part B
        
        System.out.println("*** Part B ***");
        
        for(Person person : contactList){
            showProfile(person,903);
            System.out.println("");
        }
        
        //Part C
        System.out.println("*** Part C ***");
        
        Person p3 = new Student("Maya", "Adams", 700, "Music", 3.5,105);
        System.out.println(((Student)p3).getGPA());
        
        */
        
        System.out.println("*** Part C ***");
        
        
        Professor prof1 = new Professor("Mary", "Castro", 300, "CS", 80000);
        prof1.display();
        
        Student s1 = new Student("Xavier", "Cat", 900111222, "CS", 2.0, 75);
        Student s2 = new Student("Katherine", "Johnson", 900, "CS", 4.0, 100);
        Student s3 = new Student("Roy", "Clay", 901, "Biology", 3.2, 85);
        Student s4 = new Student("Kimberly", "Bryant", 902, "EE", 3.0, 80);
        Student s5 = new Student("Grace", "Maxeem", 903, "Psyhology", 3.4, 95);

        System.out.println("");
        
        ArrayList<Student> students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        
        Collections.sort(students);
        
        for(Student s : students){
            System.out.println(s.getGPA());
        }
        
        
        
    }
    
    public static void showProfile(Person p, int id){
        if(p.getId() == id){
            p.display();
        }
    }
    
}
