package org.generation.classes;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
	public Student (String firstName, String lastName, int registration, int grade, int year){
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	} // constructor
    
    public void printFullName(){
        System.out.println("Nombre completo: " + firstName + " " + lastName);
     } // constructor

    public boolean isApproved(){
    	return grade >= 60;
    }

     public int changeYearIfApproved(){
    	 if (isApproved()) {
    		 System.out.println(firstName + " " + lastName + " aprobado.");
         }
    	 else {
    		 System.out.println(firstName + " " + lastName + " no aprobado.");
    	 }
         return year; 
     }

} // class Student
