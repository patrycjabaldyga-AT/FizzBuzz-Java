import java.util.ArrayList;

public class FizzBuzz {

    public ArrayList<String> getFizzBuzz(int startNumber, int endingNumber){

        ArrayList<String> result = new ArrayList<>();

        checkIfInputNumbersAreValid(startNumber, endingNumber);

        for (int i = startNumber; i <= endingNumber; i++){
            if (i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
            } else if (i % 3 == 0){
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    private static void checkIfInputNumbersAreValid(int startNumber, int endingNumber) {
        if (startNumber > endingNumber) {
            throw new IllegalArgumentException("Ending number is smaller than starting number!");
        }
    }
}
