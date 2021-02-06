package Session3;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    public String writeObject(Object obj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter filepath:");
        String filepath = sc.nextLine();

        try {
            FileOutputStream outFile = new FileOutputStream(filepath);
            ObjectOutputStream outObject = new ObjectOutputStream(outFile);
            outObject.writeObject(obj);
            outObject.close();
            System.out.println("Student: " + obj + " created succesfully, and saved to: " + filepath);

            return filepath;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

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
