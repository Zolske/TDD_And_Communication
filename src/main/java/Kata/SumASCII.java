package Kata;

public class SumASCII {

    public int addAscii(String input) {
        int sum = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) < 'A' || input.charAt(i) > 'Z' && input.charAt(i) > 'a' || )
            sum += (int) input.charAt(i);

        }
        return sum;
    }
}
