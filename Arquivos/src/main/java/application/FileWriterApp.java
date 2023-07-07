package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "good afternoon", "Good night"};

        String path = "C:\\Users\\Samsung\\Desktop\\in.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){//O parametro true serve para acrescentar sem apagar nada.
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
