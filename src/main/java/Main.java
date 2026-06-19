public class Main {
    static void main() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        try {
            System.out.println(fizzBuzz.getFizzBuzz(1,20));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
