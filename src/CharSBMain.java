public class CharSBMain {

    public static void main(String[] args) {
        char[][] chars = generateAlphabet();
        printArray(chars);
    }

    public static char[][] generateAlphabet() {
        char[][] table = new char[6][6];
        for (int i = 0; i < 36; i ++) {
            table[i/6][i%6] =  i < 26 ? (char) ('a'+i): (char) ('0'+i-26) ;
        }
        return table;
    }

    public static void printArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < arr[0].length; j ++) {
                stringBuilder.append(arr[i][j]);
            }
            System.out.println(stringBuilder);
        }
    }

}
