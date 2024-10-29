package Kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    @DisplayName("If string is empty an exception is thrown.")
    public void testForNonEmptyString(){
        //Arrange
        String input = "";
        //Act
        Cipher obj = new Cipher();
        //Assert
        assertThrows(IllegalArgumentException.class, () -> obj.rot13(input));
    }

    @Test
    @DisplayName("If input is 'A' then it should return 'N'.")
    public void testAbecomesG(){
        //Arrange
        String input = "A";
        String result = "N";
        //Act
        Cipher obj = new Cipher();
        //Assert
        assertEquals(result, obj.rot13(input));
    }

    @Test
    @DisplayName("If input is 'Z' then it should return 'M'.")
    public void testZbecomesM(){
        //Arrange
        String input = "Z";
        String result = "M";
        //Act
        Cipher obj = new Cipher();
        //Assert
        assertEquals(result, obj.rot13(input));
    }

    @Test
    @DisplayName("If input is 'z' then it should return 'm'.")
    public void testLowerCaseZbecomesM(){
        //Arrange
        String input = "z";
        String result = "m";
        //Act
        Cipher obj = new Cipher();
        //Assert
        assertEquals(result, obj.rot13(input));
    }

    @Test
    @DisplayName("If input is 'ABC' then it should return 'NOP'.")
    public void testStringOf3Characters(){
        //Arrange
        String input = "ABC";
        String result = "NOP";
        //Act
        Cipher obj = new Cipher();
        //Assert
        assertEquals(result, obj.rot13(input));
    }

}