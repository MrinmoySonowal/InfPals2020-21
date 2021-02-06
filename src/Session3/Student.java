package Session3;

import java.io.*;
import java.util.Arrays;

public class Student implements Serializable {

        //default serialVersion id
        private static final long serialVersionUID = 1L;

        private String first_name;
        private String last_name;
        private int age;

        public Student(String fname, String lname, int age){
            this.first_name = fname;
            this.last_name  = lname;
            this.age = age;
        }

        public void setFirstName(String fname) {
            this.first_name = fname;
        }

        public String getFirstName() {
            return this.first_name;
        }

        public void setLastName(String lname) {
            this.first_name = lname;
        }

        public String getLastName() {
            return this.last_name;
        }

        public void setAge(int age) {
            this.age = age;
        }

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

        Student[] students = {new Student("Queen", "Elizabeth", 42),
                              new Student("David", "Attenborough", 42),
                              new Student("Jimmy", "Carr", 69)};

        String filepath = fManager.writeObject(students);
        Object obj = fManager.readObject(filepath);

        System.out.println("From file " + filepath + ":");

        for (Student student : (Student[]) obj) {
            System.out.println(student);
        }
    }
}
