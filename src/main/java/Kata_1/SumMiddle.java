package Kata_1;

public class SumMiddle {
    public int sumExcludeMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        if(numbers instanceof int[])
            return 0;
        for(int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == min || numbers[i] == max)
                continue;
            sum += numbers[i];
        }

        return sum;
    }
}
