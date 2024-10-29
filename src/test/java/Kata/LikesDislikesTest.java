package Kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LikesDislikesTest {

//    @Test
//    @DisplayName("Input String Dislike should return DISLIKE")
//    public void testDislike() {
//        //Arrange
//        String input = "DISLIKE";
//        Enum result = Action.DISLIKE;
//        //Act
//        LikesDislikes obj = new LikesDislikes();
//        //Assert
//        assertEquals(result, obj.likeOrDislike(input));
//    }

    @Test
    @DisplayName("Input String two Dislike should return NEUTRAL")
    public void testTwoDislike() {
        //Arrange
        String[] input = {"DISLIKE", "DISLIKE"};
        Enum result = Action.NEUTRAL;
        //Act
        LikesDislikes obj = new LikesDislikes();
        //Assert
        assertEquals(result, obj.likeOrDislike(input));
    }

    @Test
    @DisplayName("Input String multiple strings should return NEUTRAL")
    public void testMultipleInput() {
        //Arrange
        String[] input = {"DISLIKE", "DISLIKE" , "LIKE" , "DISLIKE", "DISLIKE", "LIKE"};
        Enum result = Action.NEUTRAL;
        //Act
        LikesDislikes obj = new LikesDislikes();
        //Assert
        assertEquals(result, obj.likeOrDislike(input));
    }

    @Test
    @DisplayName("Input String multiple strings should return Like")
    public void testMultipleInputResultLike() {
        //Arrange
        String[] input = {"DISLIKE", "LIKE" , "LIKE" , "DISLIKE", "DISLIKE", "LIKE", "LIKE"};
        Enum result = Action.LIKE;
        //Act
        LikesDislikes obj = new LikesDislikes();
        //Assert
        assertEquals(result, obj.likeOrDislike(input));
    }

}