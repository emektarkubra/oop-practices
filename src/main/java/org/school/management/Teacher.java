package org.school.management;

import java.util.List;

public class Teacher extends Person{
    private String branch;

    public Teacher(String id,String name, String surname){
        super(id, name, surname);
    }

    @Override
    public String writePerson() {
        return super.writePerson() + ", BRANCH: " + branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
