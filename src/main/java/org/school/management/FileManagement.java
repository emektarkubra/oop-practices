package org.school.management;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagement {

    public  void writeToFile(String student, String fileName) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File(fileName),true))){
                writer.write(student);
                writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
