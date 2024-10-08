package org.generation;

import org.generation.classes.Student;
import org.generation.classes.Course;

public class Main {
    public static void main(String[] args) {
        // Crear curso
        Course course = new Course("Artes", "Arq. Andrea", 2024);
        
        // Crear estudiantes
        Student JuanGarcia = new Student("Juan", "Garcia", 12345, 90, 2);
        Student AndreiWoolfolk = new Student("Andrei", "Woolfolk", 67890, 55, 2);
        
        System.out.println("Estudiantes Inscritos:");
        // Inscribir estudiantes 
        course.enroll(JuanGarcia);
        course.enroll(AndreiWoolfolk);
        
        System.out.println();
        
        System.out.println("Estudiantes Status:");
        // Estudiantes pasantes
        JuanGarcia.changeYearIfApproved();
        AndreiWoolfolk.changeYearIfApproved();
        
        System.out.println();
        
        // Nombre del curso
        String courseName = course.getCourseName();

        // Contar estudiantes
        course.countStudents();

        // Mejor calificación
        course.bestGrade();
        
    } // main
} // class Main

