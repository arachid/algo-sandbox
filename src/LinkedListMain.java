import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int num = list.pollLast();
    }
}
