package test;

import jdk.jfr.StackTrace;
import main.FizzBuzzCalculator;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzCalculatorMust {

    @Test
    public void returnOneWhenPassedOne(){
        // Arrange - we need fizz buzz Calculator of the elements
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        // Act - should test one line
        String result = fizzBuzzCalculator.calculate(1);

        // Assert - check the result of test - leave 2
        Assert.assertEquals("1", result);
    }

    @Test
    public void returnTwoWhenPassedTwo(){
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        String result = fizzBuzzCalculator.calculate(2);

        Assert.assertEquals("2", result);
    }

    @Test
    public void returnFizzWhenPassedThree(){
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        String result = fizzBuzzCalculator.calculate(3);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void returnFizzWhenPassedSix()
    {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        Assert.assertEquals("Fizz", fizzBuzzCalculator.calculate(6));
    }

    @Test
    public void returnFizzWhenPassedNumberDivisibleByThree()
    {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        Assert.assertEquals("Fizz", fizzBuzzCalculator.calculate(9));
    }
    @Test
    public void returnBuzzWhenPassedByFive()
    {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        Assert.assertEquals("Buzz",fizzBuzzCalculator.calculate(10));
    }
}
