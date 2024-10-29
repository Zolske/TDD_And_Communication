package Kata;

public class Cipher {

//    public String rot13(String input) {
//        if (input.isEmpty())
//            throw new IllegalArgumentException();
//        // A 65 to Z 90
//        char add13;
//        char nChar;
//        StringBuilder result = new StringBuilder();
//        for(int i = 0; i < input.length(); i++) {
//            add13 = (char) (input.charAt(i) + 13);
//        if ((add13 > 'Z' && add13 < 'a') || (add13 > 'z') )
//            nChar = (char) (add13 - 26);
//        else
//            nChar = add13;
//        result.append(nChar);
//        }
//        return result.toString();
   // }
            String rot13(String message) {
                if (message.isEmpty())
                    throw new IllegalArgumentException();
                int offset = 13;
                StringBuilder result = new StringBuilder();
                for (char character : message.toCharArray()) {
                    if(character >= 'A' && character <= 'Z') {
                            int originalAlphabetPosition = character - 'A';
                            int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                            char newCharacter = (char) ('A' + newAlphabetPosition);
                            result.append(newCharacter);
                    }
                    else if (character >= 'a' && character <= 'z') {
                        int originalAlphabetPosition = character - 'a';
                        int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                        char newCharacter = (char) ('a' + newAlphabetPosition);
                        result.append(newCharacter);
                    } else {
                        result.append(character);
                    }
                }
                return result.toString();
            }

}
