public class FizzBuzz {
    public void fizzBuzz(int number){
        if (number == 3){
            System.out.println("Fizz");
        }
        else if (number == 5){
            System.out.println("Buzz");
        }
        else if (number == 15){
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println(number);
        }
    }
}