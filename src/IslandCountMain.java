public class IslandCountMain {

    public static void main(String[] args) {
//        int[][] map = {
//                {0, 0, 0, 0, 0, 0},
//                {0, 0, 1, 0, 0, 0},
//                {0, 0, 1, 0, 1, 0},
//                {0, 0, 1, 0, 1, 0}
//        };
//        int count = islandCount(map);
//        System.out.println("The number island is: "+count);
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col ++) {
                if(grid[row][col] == '1') {
                    visit(grid, row, col);
                    count++;
                }
            }
        }
        return count;
    }

    public void visit(char[][] grid, int row, int col) {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != '1') return;
        grid[row][col] = '0';
        visit(grid, row, col+1);
        visit(grid, row+1, col);
        visit(grid, row, col-1);
        visit(grid, row-1, col);
    }


}
