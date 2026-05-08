import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void checkIfFizzBuzz(){
        ArrayList<String> result = FizzBuzz.getFizzBuzz(1,20);
        assertEquals("1",result.get(0)); // We check the normal number
        assertEquals("Fizz", result.get(2)); // We expect Fizz
        assertEquals("Buzz", result.get(4)); // We expect Buzz
        assertEquals("FizzBuzz", result.get(14)); // We expect FizzBuzz
    }
}