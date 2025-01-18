package org.school.management;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    List<String> lessons;

    public Student(String id, String name, String surname){
        super(id,name, surname);
        this.lessons = new ArrayList<>(3);
    }

    public void addLesson(String lesson){
        lessons.add(lesson);
    }

    @Override
    public String writePerson() {
        String lessonsInfo = (lessons != null && !lessons.isEmpty()) ? String.join(", ", lessons) : "No lessons assigned";
        return super.writePerson() + ", LESSONS: " + lessonsInfo;
    }
}
