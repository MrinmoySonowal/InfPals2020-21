package Session1;

import java.util.Scanner;

/*
Class to indicate a person, contains name,age, likesIceCream and whether the person is anonymous as fields
 */
class Person {

    /**
     * Name of the person
     */
    private String name;

    /**
     * Age of the person
     */
    private int age;

    /**
     * Boolean to indicate whether this person likes ice cream
     */
    private boolean likesIceCream;

    /**
     * Boolean to indicate whether this person is anonymous, if the person is then name,age and other fields are kept null
     */
    private boolean anonymous;

    /**
     * Constructor called when Person is anonymous
     *
     * @param likesIceCream - field got from the main method, indicates whether our person likes ice cream
     */
    public Person (boolean likesIceCream) {
        this.anonymous     = true;
        this.likesIceCream = likesIceCream;
    }

    /**
     * Constructor called when person has given consent to collect details
     *
     * @param name          - Name of the person
     * @param age           - age of the person
     * @param likesIceCream - indicates whether the person likes ice-cream
     */
    public Person (String name, int age, boolean likesIceCream) {
        if ( name == null ) {
            throw new NullPointerException ( "Name field required, cannot be null" );
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException ( "Blank or empty names not allowed" );
        }
        if ( isNotLegalName ( name ) ) {
            throw new IllegalArgumentException ( "Name must only contain alphabets and spaces" );
        }
        if (age < 0) {
            throw new IllegalArgumentException ( "Age must be greater than zero" );
        }

        this.name          = name;
        this.age           = age;
        this.likesIceCream = likesIceCream;
        this.anonymous     = false;
    }

    /**
     * Function returns false if the name contains any character other than a letter or a space
     *
     * @param name - A string received from the user as input
     * @return - True if name obeys the aforementioned rule else false
     */
    private boolean isNotLegalName (String name) {
        for ( int i = 0; i < name.length() ; i++ ) {
            char c = name.charAt ( i );
            if ( c != ' ' ) {
                if ( !Character.isLetter ( c ))  {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Method to represent the class,
     * if the person is anonymous we indicate that the person is anonymous and print likesIceCream
     *
     * @return - String representation of class
     */
    @Override
    public String toString () {
        if ( !anonymous ) {
            return "Person{" +
                    " name='" + name + '\'' +
                    ", age=" + age +
                    ", likesIceCream=" + likesIceCream +
                    '}';
        }
        return "Person{ Anonymous, likesIceCream= " + likesIceCream + "}";
    }

    /**
     * Getter method for name
     *
     * @return Name of the Person
     */
    private String getName () {
        return name;
    }

    /**
     * Getter method for age
     *
     * @return Age of the person
     */
    private int getAge () {
        return age;
    }

    /**
     * Getter method for likesIceCream
     *
     * @return likesIceCream - Indicates whether the person likes ice cream
     */
    private boolean isLikesIceCream () {
        return likesIceCream;
    }

    /**
     * Getter method for anonymous
     *
     * @return anonymous - indicates whether the person is anonymous
     */
    private boolean isAnonymous () {
        return anonymous;
    }

    /**
     * Method to set name, only names with alphabets and space
     * @param name - Name got from instance of class
     */
    private void setName(String name){
        if ( name.isBlank() || name.isEmpty() ) {
            throw new IllegalArgumentException ( "Blank or empty names not allowed" );
        }
        if ( isNotLegalName ( name ) ){
            throw new IllegalArgumentException ( "Name must only contain " );
        }
        this.name = name;
    }
}

/**
 * Main class
 */
public class DataPrivacy {
    /**
     * Indicates the number of people who are filling their details
     */
    private static int NUM_PEOPLE = 3;

    public static void main (String[] args) {
        Scanner scanner = new Scanner ( System.in );
        Person[] p = new Person[NUM_PEOPLE]; // Our environment would contain 3 people
        for ( int i = 0; i < NUM_PEOPLE; i++ ) {
            System.out.println ( "Do you wish to enter your details?  (Enter True or False)" );
            boolean isAnonymous = !scanner.nextBoolean ( );
            if ( isAnonymous ) {
                System.out.println ( "Do you like IceCream ? (Enter True or False)" );
                p[i] = new Person ( scanner.nextBoolean() );
            } else {
                p[i] = getPerson ( scanner );
            }
        }

        for ( Person p1 : p ) {
            System.out.println ( p1 );
        }
    }

    /**
     * Method to initialize a person object
     * Collects name, age, anonymous and whether the person likes ice cream from the terminal
     *
     * @param scanner - Scanner class received from main method
     * @return Person - A class that contains the details of the person
     */
    private static Person getPerson (Scanner scanner) {
        System.out.println ( "Enter your name" );
        String name = scanner.nextLine();

        System.out.println ( "Enter your age" );
        int age = scanner.nextInt();

        System.out.println ( "Do you like Ice Cream? (Enter True or False)" );
        boolean likesIceCream = scanner.nextBoolean();
        scanner.close ();
        return new Person ( name, age, likesIceCream );
    }
}