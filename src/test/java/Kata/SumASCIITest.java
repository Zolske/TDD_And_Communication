package Kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumASCIITest {

    @Test
    @DisplayName("Input is an empty string expecting '0'")
    public void testEmptyString(){
        //Arrange
        String input = "";
        int expect = 0;
        //Act
        SumASCII obj = new SumASCII();
        //Assert
        assertEquals(expect, obj.addAscii(input));
    }

    @Test
    @DisplayName("Input string 'a' string expecting '97'")
    public void testCharacter(){
        //Arrange
        String input = "a";
        int expect = 97;
        //Act
        SumASCII obj = new SumASCII();
        //Assert
        assertEquals(expect, obj.addAscii(input));
    }

    @Test
    @DisplayName("Input string 'northcoders' string expecting '97'")
    public void testNorthcodersString(){
        //Arrange
        String input = "northcoders";
        int expect = 1195;
        //Act
        SumASCII obj = new SumASCII();
        //Assert
        assertEquals(expect, obj.addAscii(input));
    }

    @Test
    @DisplayName("Input string not included in Ascii table 'ß' string expecting '0'")
    public void testNonAsciiString(){
        //Arrange
        String input = "ß";
        int expect = 0;
        //Act
        SumASCII obj = new SumASCII();
        //Assert
        assertEquals(expect, obj.addAscii(input));
    }

}