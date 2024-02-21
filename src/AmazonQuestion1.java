import java.util.Arrays;

public class AmazonQuestion1 {

    public static void main(String[] args) {
        int input[] = {10, 3, 4, 2, 5, 7, 9, 11};
        int min = minimumSwap(input);
    }

    public static int minimumSwap(int[] input) {
        if(input.length == 1 || input.length == 0){
            return 0;
        }
        int swapCount = 0;
        for(int i = 0; i < input.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j = i; j < input.length; j++) {
                if(input[j] < min){
                    min = Math.min(min, input[j]);
                    index = j;
                }
            }

            for(int j = index; j > i; j--) {
                int tmp = input[j-1];
                input[j-1] = input[j];
                input[j] = tmp;
                swapCount++;
            }

        }

        return swapCount;
    }
}
