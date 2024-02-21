import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> blocks = new ArrayList<>();
        blocks.add(3); // [3 2 1]
        blocks.add(2);
        blocks.add(1);
        blocks = reShift(blocks, 0, 2);
        System.out.println("end");
    }

    public static int getMinNumMoves(List<Integer> blocks) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i= 0; i < blocks.size(); i++) {
            maxHeap.add(blocks.get(i));
        }
        int swapCount = 0;
        while (maxHeap.size() != 0) {
            int placedCount = blocks.size() - maxHeap.size(); // 0
            int max = maxHeap.poll(); // max = 3
            int maxIndex = getIndex(blocks, max); // 0
            swapCount += Math.abs(maxIndex - (blocks.size() - placedCount - 1)); // 0 - (3 - 0 -1)
            blocks = reShift(blocks, maxIndex, placedCount-1);
        }
        return swapCount;
    }

    private static int getIndex(List<Integer> blocks, int value) {
        for(int i = 0; i < blocks.size(); i++) {
            if(blocks.get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    private static List<Integer> reShift(List<Integer> blocks, int start, int end) {
        ArrayList<Integer> reshifted = new ArrayList<>(blocks.size());
        int startValue = blocks.get(start); // 3
        int endValue = blocks.get(end); // 1
        for(int i = start; i < end; i++) {
            reshifted.set(i, blocks.get(i+1));
        }
        reshifted.set(start, startValue);
        reshifted.set(end, endValue);
        return reshifted;
    }

}
