package Kata;

public class SumASCII {

    public int addAscii(String input) {
        int sum = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) <= (char) 127)
                sum += (int) input.charAt(i);

        }
        return sum;
    }
}
