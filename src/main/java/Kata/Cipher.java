package Kata;

public class Cipher {

    public String rot13(String input) {
        if (input.isEmpty())
            throw new IllegalArgumentException();
        // A 65 to Z 90
        char add13;
        char nChar;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            add13 = (char) (input.charAt(i) + 13);
        if ((add13 > 'Z' && add13 < 'a') || (add13 > 'z') )
            nChar = (char) (add13 - 26);
        else
            nChar = add13;
        result.append(nChar);
        }
        return result.toString();
    }
}
