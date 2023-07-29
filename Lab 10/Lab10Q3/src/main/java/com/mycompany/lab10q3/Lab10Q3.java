package com.mycompany.lab10q3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10Q3 
{
    public static void main(String[] args)
    {
        String filename = "nonexistent_file.txt";
        File file = new File(filename);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + filename + "' does not exist.");
        }
    }
}
