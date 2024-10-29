package Kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SumMiddleTest {
    @Test
    @DisplayName("Sum all numbers except highest and lowest number.")
    public void testSumMiddleAddition(){
        //Arrange
        int[] numbers = {5, 2, 6, 10, 22 };
        int expect = 21;
        //Act
        SumMiddle intResult = new SumMiddle();
        //Assert
        assertEquals(expect, intResult.sumExcludeMinMax(numbers));
    }
    @Test
    @DisplayName("Test with input 'null'")
    public void testNullInput(){
        //Arrange
        int expect = 0;
        //Act
        SumMiddle intResult = new SumMiddle();
        //Assert
        assertEquals(expect, intResult.sumExcludeMinMax(null));
    }
    @Test
    @DisplayName("Test with array with elements of 3 or less")
    public void testSmallArray(){
        //Arrange
        int expect = 0;
        int[] numbers = {1, 2};
        //Act
        SumMiddle intResult = new SumMiddle();
        //Assert
        assertEquals(expect, intResult.sumExcludeMinMax(numbers));
    }
}