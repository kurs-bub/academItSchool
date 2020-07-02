package ru.bubenova.completedTask.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class ConvertToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
       try (Scanner scanner = new Scanner(new FileInputStream("text.txt"));
            PrintWriter writer = new PrintWriter("textOut.txt")) {
           while (scanner.hasNextLine()) {
               writer.println(scanner.nextLine().toUpperCase());
           }
        }
    }
}