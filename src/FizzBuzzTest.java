import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FizzBuzzTest {

    @Test
    public void WhenInputIsMultipleOf3ReturnFizz(){
        assertEquals("Fizz",FizzBuzz.doTheThing(6));
    }

    @Test
    public void WhenInputIsMultipleOf5ReturnBuzz(){
        assertEquals("Buzz",FizzBuzz.doTheThing(10));
    }

    @Test
    public void WhenInputIsMultipleOf3And5ReturnFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.doTheThing(45));
    }

    @Test
    public void WhenInputIsNotMultipleOfAnythingReturnsSelf(){
        assertNotEquals("FizzBuzz", FizzBuzz.doTheThing(32));
    }

}