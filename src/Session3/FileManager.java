package Session3;

import java.io.*;
import java.util.Scanner;

/**
 * Enables reading and writing of class instances from and into files, respectively
 */
public class FileManager {
    /**
     * Method to write object of a class into a file
     * @param obj - Arbitrary object of any class, including array of classes
     * @return - Returns the file path of type String
     */
    public String writeObject(Object obj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter filepath:");
        String filepath = sc.nextLine();

        try {
            FileOutputStream outFile = new FileOutputStream(filepath);
            ObjectOutputStream outObject = new ObjectOutputStream(outFile);
            outObject.writeObject(obj);
            outObject.close();
            System.out.println("Student: " + obj + " created successfully, and saved to: " + filepath);

            return filepath;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Reads object from a binary file
     * @param filepath - A file path to the binary file
     * @return - The object (Any class instance) in the file
     */
    public Object readObject(String filepath) {
        try {
            FileInputStream inFile = new FileInputStream(filepath);
            ObjectInputStream inObject = new ObjectInputStream(inFile);

            Object obj = inObject.readObject();

            System.out.println("The Object has been read from the file");
            inObject.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
