import javax.xml.transform.Result;
import java.util.ArrayList;

public class FizzBuzz {
    static void main() {
        try {
            System.out.println(getFizzBuzz(1,20));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> getFizzBuzz(int startNumber, int endingNumber){

        ArrayList<String> result = new ArrayList<String>();

        if (startNumber > endingNumber) {
            throw new IllegalArgumentException("Ending number is smaller than starting number!");
        }
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
}
