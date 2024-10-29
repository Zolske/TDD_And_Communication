package Kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateMeanTest {

    @Test
    @DisplayName("Input array is empty expecting 0 as return.")
    public void testEmptyArray(){
        //Arrange
        int[] numbers = { };
        int expect = 0;
        //Act
        CalculateMean obj = new CalculateMean();
        //Assert
        assertEquals(expect, obj.meanAverage(numbers));
    }

    @Test
    @DisplayName("Input array two elements expecting average as return.")
    public void testTwoElementArray(){
        //Arrange
        int[] numbers = {1,2};
        double expect = 1.5;
        //Act
        CalculateMean obj = new CalculateMean();
        //Assert
        assertEquals(expect, obj.meanAverage(numbers));
    }

    @Test
    @DisplayName("Input is 'null' should return 0.")
    public void testNullInput(){
        //Arrange
        double expect = 0;
        //Act
        CalculateMean obj = new CalculateMean();
        //Assert
        assertEquals(expect, obj.meanAverage(null));
    }

    @Test
    @DisplayName("Large numbers as input should still return average")
    public void testLargeNumberInput(){
        //Arrange
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        double expect = 5;
        //Act
        CalculateMean obj = new CalculateMean();
        //Assert
        assertEquals(expect, obj.meanAverage(numbers));
    }

    @Test
    @DisplayName("Complex numbers as input should return average.")
    public void testComplexNumberInput(){
        //Arrange
        int[] numbers = {90000, 65352, 8993, 34};
        double expect = 41094.75;
        //Act
        CalculateMean obj = new CalculateMean();
        //Assert
        assertEquals(expect, obj.meanAverage(numbers));
    }

    @Test
    @DisplayName("Negative numbers as input should return average.")
    public void testNegativeNumberInput(){
        //Arrange
        int[] numbers = {-90000, -65352, 8993, -34, 567823};
        double expect = 84286;
        //Act
        CalculateMean obj = new CalculateMean();
        //Assert
        assertEquals(expect, obj.meanAverage(numbers));
    }
}