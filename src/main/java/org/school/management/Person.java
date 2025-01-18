package org.school.management;

public class Person {
   String id;
   String name;
   String surname;

   public Person(String id, String name, String surname){
       this.id = id;
       this.name = name;
       this.surname = surname;
   }

    public String writePerson() {
        return "ID: " + id + ", NAME: " + name + ", SURNAME: " + surname;
    }
}