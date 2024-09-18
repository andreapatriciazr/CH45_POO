package org.generation.classes;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String professorName;
    private int year;
    private List<Student> students;

    // Constructor
    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>(); 
    }

    // Métodos para obtener el nombre del curso
    public String getCourseName() {
        return courseName;
    }

    // Método para inscribir un estudiante
    public void enroll(Student student) {
        students.add(student);
        System.out.println(student.firstName + " " + student.lastName + " inscrito en " + courseName);
    }
    
    // Método para contar estudiantes
    public int countStudents() {
        int total = students.size();
        System.out.println("Total de estudiantes inscritos: " + total);
        return total;
    }

   // Método para obtener la mejor calificación
    public int bestGrade() {
        int bestGrade = 0;
        for (Student student : students) {
            if (student.grade > bestGrade) {
                bestGrade = student.grade;
            }
        }
        System.out.println("Mejor calificación: " + bestGrade);
        return bestGrade;
    }
}