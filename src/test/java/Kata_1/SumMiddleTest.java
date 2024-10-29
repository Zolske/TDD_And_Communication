package Kata_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    @DisplayName("Test with imput 'null'")
    public void testNullInput(){
        int expect = 0;
        //Act
        SumMiddle intResult = new SumMiddle();
        //Assert
        assertEquals(expect, intResult.sumExcludeMinMax(null));
    }


}