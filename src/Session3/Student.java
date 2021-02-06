package Session3;

import java.io.*;
import java.util.Arrays;

/**
 * Student class to demonstrate file manager
 * We use the serialize interface
 */
public class Student implements Serializable {

    /**default serialVersion id*/
    private static final long serialVersionUID = 1L;
    /** First name of the student*/
    private String first_name;
    /** Surname of the student*/
    private String last_name;
    /** Age of the student */
    private int age;

    /**
     *
     * @param fname - first name of the student
     * @param lname - surname of the student
     * @param age - age of the student
     */
    public Student(String fname, String lname, int age){
        this.first_name = fname;
        this.last_name  = lname;
        this.age = age;
    }

    /**
     * Setter method for first Name of the student
     * @param fname - The first name of the student
     */
    public void setFirstName(String fname) {
        this.first_name = fname;
    }

    /**
     * Getter for first name of the student
     * @return  First name of the student
     */
    public String getFirstName() {
        return this.first_name;
    }

    /**
     * Sets last name of the student
      * @param lname - Last name of the student
     */
    public void setLastName(String lname) {
        this.first_name = lname;
    }

    /**
     * Getter method for last name of the student
     * @return - last name of the student
     */
    public String getLastName() {
        return this.last_name;
    }

    /**
     * Set age of the student
     * @param age - Age of the student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get age of the student
     * @return - Age of the student
     */
    public int getAge() {
            return this.age;
    }

    @Override
    public String toString() {
        return " First Name: " + this.first_name +
                " Last Name : " + this.last_name + " Age : " + this.age;
    }


    public static void main(String[] args) {
        FileManager fManager = new FileManager();

        Student[] students = {new Student("Queen", "Elizabeth II", 94),
                              new Student("David", "Attenborough", 94),
                              new Student("Jimmy", "Carr", 48)};

        String filepath = fManager.writeObject(students);
        Object obj = fManager.readObject(filepath);

        System.out.println("From file " + filepath + ":");

        for (Student student : (Student[]) obj) {
            System.out.println(student);
        }
    }
}
