package Session3;

/**
 * Circle class
 */
class Circle {

    /** Radius of the circle */
    private int radius;

    /** Area is calculated as PI* radius * radius
     * In order to avoid repeated calculations we save it in this field
     */
    private float area;

    /** The constant π */
    private final float PI = (float) 3.14159;

    /**
     * Constructor for the Circle class
     * @param radius - Radius of a new circle
     */
    Circle (int radius){
        this.radius = radius;
        this.area = PI*radius*radius;
    }

    /**
     * Gets the radius of the circle
     * @return - The radius of the circle object
     */
    public int getRadius () {
        return radius;
    }

    /**
     * Getter method for the area of the circle
     * @return - The area of the given circle
     */
    public float getArea () {
        return area;
    }

    /**
     * Sets new radius of the circle, method changes other fields as they are associated to radius
     * @param radius - New radius of the circle
     */
    public void setRadius (int radius) {
        this.radius = radius;
        // These changes are made as
        this.area = PI*radius*radius;
    }
}

/**
 * Demonstrate the use of setters
 */
public class ExampleSetter {
    public static void main (String[] args) {
        Circle c = new Circle ( 2 );
        System.out.println ("Area of circle = "+ c.getArea() );
        System.out.println ("Radius of circle ="+ c.getRadius() );

        c.setRadius ( 3 );
        System.out.println ("Area of circle = "+ c.getArea() );
        System.out.println ("Radius of circle ="+ c.getRadius() );
  
    }
}

