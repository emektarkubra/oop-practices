package org.school.management;
import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> students;
    List<Teacher> teachers;

    public School(){
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public  void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public  void writeInfo(){
        System.out.println("Ogrenciler");
        for(Student student : students){
            System.out.println(student.id);
        }

        System.out.println("Teachers");
        for(Teacher teacher : teachers) {
            System.out.println(teacher.id);
        }
    }

    public void saveToFile() {
        FileManagement fileManagement = new FileManagement();
        System.out.println("Students");
        for(Student student : students){
            fileManagement.writeToFile(student.writePerson(),"/Users/kubraemektar/Desktop/java-files/students.text");

        }
        System.out.println("Teachers");
        for(Teacher teacher : teachers){
            fileManagement.writeToFile(teacher.writePerson(),"/Users/kubraemektar/Desktop/java-files/teachers.text");
        }
    }

    public void SaveFile(){
        System.out.println("saved");
    }
}
