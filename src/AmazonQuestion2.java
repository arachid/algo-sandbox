import java.util.PriorityQueue;

public class AmazonQuestion2 {

    public static void main(String[] args) {
        long minCost = getMinimumCost(new int[]{1,3,2}, new int[]{2,1,3}, 5);
    }

    static class Item {
        private int a;
        private int b;
        private int j;
        private int cost;

        public Item(int a, int b) {
            this.a = a;
            this.b = b;
            this.j = 0;
            this.cost = 0;
            this.incrementCost();
        }
        public void incrementCost() {
            j++;
            this.cost = a +(j-1)*b;
        }

        public int getCost(){
            return this.cost;
        }
    }


    public static long getMinimumCost(int[] a, int[] b, int m){
        PriorityQueue<Item> items = new PriorityQueue<>((i1, i2) -> i1.getCost() - i2.getCost());
        for(int i = 0; i < a.length; i++) {
            items.add(new Item(a[i], b[i]));
        }
        long total = 0;
        for(int i = 0; i < m; i++) {
            Item cheapest = items.poll();
            total += cheapest.getCost();
            cheapest.incrementCost();
            items.add(cheapest);
        }
        return total;
    }

}
