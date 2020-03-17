package main;

public class FizzBuzzCalculator {
    public static String calculate(int number) {
        if(number % 5 == 0 &&(number % 3 == 0)) {
            return "FizzBuzz";
        }
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}