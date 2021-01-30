package Session1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private String name;
    private int age;
    private boolean likesIceCream;
    private String[] names;
    private int[] ages;
    private boolean[] iceCreamBools;

    @Before
    public void setup(){
        name = "Dinesh";
        age = 19;
        likesIceCream = true;
        names = new String[]{"Arunesh","Amaresh","Anton"};
        ages = new int[]{19,19,20};
        iceCreamBools = new boolean[]{true,false,true};
    }

    @Test
    public void testNormalConstructor(){
        assertEquals ( new Person (name,age,likesIceCream).toString (), "Person{ name='Dinesh', age=19, likesIceCream=true}" );
    }

    @Test
    public void testAnonymConstructor(){
        assertEquals ( new Person ( true ).toString (), "Person{ Anonymous, likesIceCream= true}");
    }

    @Test
    public void testArrayPerson (){
    
    }
}