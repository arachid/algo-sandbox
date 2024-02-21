import java.util.*;
import java.util.stream.Stream;

public class ArrayListPlayGround {

    static class Num {
        public int val;
        public Num(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {0, 1, 7, 3, 4, 5, 6};
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
//        list.sort(Comparator.naturalOrder());

        List<Num> list = new ArrayList<>(Stream.of(arr).map(c -> new Num(c)).toList());

        list.sort((o1, o2) -> o2.val - o1.val);

        System.out.println("End");
    }
}
