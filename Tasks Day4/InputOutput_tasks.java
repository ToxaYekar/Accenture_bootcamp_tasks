package Day4;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class InputOutput_tasks {

    // Get a list of all the file names from the folder.
    public static void Exercise1() {
        File folder = new File("F:/New folder");
        File[] fileList = folder.listFiles();
        for (File name : fileList) {
            System.out.println(name.getName());
        }
        System.out.println("______________________________________");

    }

    // Get the last modified time of a file.
    public static void Exercise7() {
        File file = new File("F:/New folder/123.txt");
        Date date = new Date(file.lastModified());
        System.out.println("Last modification:" + date);
        System.out.println("______________________________________");
    }

    // Read a file content line by line.
    public static void Exercise11() {
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("F:/New folder/456.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File was not found.");
        } catch (IOException e) {
            System.err.println("Failed to read the file.");
        }
        System.out.println("______________________________________");
    }

    // Append text to an existing file.
    public static void Exercise16() {
        String line = "";
        try {
            File file = new File("F:/New folder/456.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("\nTesting writing function.");
            fileWriter.close();

            BufferedReader br = new BufferedReader(new FileReader("F:/New folder/456.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("File was not found.");
        }
        System.out.println("______________________________________");
    }

    // Find the longest word in a text file.
    public static void Exercise18() throws FileNotFoundException {
        String longestWord = "";
        String word;
        Scanner sc = new Scanner(new File("F:/New folder/456.txt"));

        do {
            word = sc.next();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        } while (sc.hasNext());

        System.out.printf("Longest word in the file is '%s'", longestWord);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Exercise1();
        Exercise7();
        Exercise11();
        Exercise16();
        Exercise18();

    }


}
