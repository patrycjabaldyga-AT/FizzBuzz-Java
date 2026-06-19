import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void checkOneTillTwentyFizzBuzzTest(){

        //Arrange:
        FizzBuzz fizzBuzz = new FizzBuzz();
        int startingNumber = 1;
        int endingNumber = 20;

        // Act:
        ArrayList<String> result = fizzBuzz.getFizzBuzz(startingNumber,endingNumber);
        String expected = "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz]";

        //Assert:
        assertEquals(expected,String.valueOf(result));
    }

    @Test
    void checkBasicNumberTest(){

        // Arrange:
        FizzBuzz fizzBuzz = new FizzBuzz();
        int startingNumber = 1;
        int endingNumber = 1;

        // Act:
        ArrayList<String> result = fizzBuzz.getFizzBuzz(startingNumber,endingNumber);
        String expected = "1";

        //Assert:
        assertEquals(expected,result.getFirst());
    }

    @Test
    void checkDivisibleByThreeFizzTest(){

        //Arrange:
        FizzBuzz fizzBuzz = new FizzBuzz();
        int startingNumber = 3;
        int endingNumber = 3;

        //Act:
        ArrayList<String> result = fizzBuzz.getFizzBuzz(startingNumber,endingNumber);
        String expected = "Fizz";

        //Assert:
        assertEquals(expected,result.getFirst());
    }

    @Test
    void checkDivisibleByFiveBuzzTest(){

        //Arrange:
        FizzBuzz fizzBuzz = new FizzBuzz();
        int startingNumber = 5;
        int endingNumber = 5;

        //Act:
        ArrayList<String> result = fizzBuzz.getFizzBuzz(startingNumber,endingNumber);
        String expected = "Buzz";

        //Assert:
        assertEquals(expected,result.getFirst());
    }

    @Test
    void checkDivisibleByThreeAndFiveFizzBuzzTest(){

        //Arrange:
        FizzBuzz fizzBuzz = new FizzBuzz();
        int startingNumber = 15;
        int endingNumber = 15;

        //Act:
        ArrayList<String> result = fizzBuzz.getFizzBuzz(startingNumber,endingNumber);
        String expected = "FizzBuzz";

        //Assert:
        assertEquals(expected,result.getFirst());
    }

}