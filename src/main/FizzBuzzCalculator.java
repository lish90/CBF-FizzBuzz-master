package main;

public class FizzBuzzCalculator {
    public String calculate(int number) {
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0)
            return "Buzz";

        return Integer.toString(number);
    }
}