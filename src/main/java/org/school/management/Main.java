package org.school.management;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        // student
        System.out.println("Please, Enter Student ID");
        String id = scanner.nextLine();

        System.out.println("Please, Enter Student Name");
        String name = scanner.nextLine();

        System.out.println("Please, Enter Student Surname");
        String surname = scanner.nextLine();

        Student student = new Student(id,name,surname);

        System.out.println("Enter 5 lessons for the student:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter lesson " + (i + 1) + ":");
            String lesson = scanner.nextLine();
            student.addLesson(lesson);
        }
        System.out.println(student.writePerson());


        // teacher
        System.out.println("Please, Enter Teacher ID");
        String teacherId = scanner.nextLine();

        System.out.println("Please, Enter Teacher Name");
        String teacherName = scanner.nextLine();

        System.out.println("Please, Enter Teacher Surname");
        String teacherSurname = scanner.nextLine();

        System.out.println("Please, Enter Teacher Branch");
        String teacherBranch = scanner.nextLine();

        Teacher teacher = new Teacher(teacherId,teacherName,teacherSurname);
        teacher.setBranch(teacherBranch);

        System.out.println(teacher.writePerson());


        School school = new School();
        school.addStudent(student);
        school.addTeacher(teacher);
        school.writeInfo();

        school.saveToFile();

    }
}