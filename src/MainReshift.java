public class MainReshift {


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6}; // length = 7
        int stat = 1;
        int end = 5;
        int[] newArr = shift(arr, 2);
        // { 1, 6, 2, 3, 4, 5, 7 }
        System.out.println("end");
    }

    public static void shift(int[] arr, int start, int end) {
        arr[start] = arr[end];
        for(int i = end; i <= start +1; i--) {
            arr[i] = arr[i-1];
        }
    }

    public static int[] shift(int[] arr, int n) {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[(i+n)%arr.length];
        }
        return newArr;
    }


}
