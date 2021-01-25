package Session1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private String name;
    private int age;
    private boolean likesIceCream;

    @Before
    public void setup(){
        name = "Rajesh";
        age = 16;
        likesIceCream = true;
    }

    @Test
    public void testNormalConstructor(){
        assertEquals ( new Person (name,age,likesIceCream).toString (), "Person{ name='Rajesh', age=16, likesIceCream=true}" );
    }

    @Test
    public void testAnonymConstructor(){
        assertEquals ( new Person ( true ).toString (), "Person{ Anonymous, likesIceCream= true}");
    }
}