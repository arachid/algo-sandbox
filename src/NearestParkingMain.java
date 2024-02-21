import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class NearestParkingMain {

    public static void main(String[] args) {
        int[][] map = {
                {0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 1, 2, 1, 0},
                {0, 0, 1, 0, 1, 0}
        };

        System.out.println(getNearestParking(map, 0, 0, 0));
    }

    private static Integer getNearestParking(int[][] map, int row, int col, int cumul) {

        if(row < 0 || row >=map.length || col < 0 || col >= map[0].length || map[row][col] == 1){
            return null;
        } else if (map[row][col] == 2){
            return cumul;
        } else {
            map[row][col] = 1;
            return Stream.of(
                            getNearestParking(map, row, col+1, cumul+1),
                            getNearestParking(map, row+1, col, cumul+1),
                            getNearestParking(map, row, col-1, cumul+1),
                            getNearestParking(map, row-1, col, cumul+1))
                    .filter(Objects::nonNull)
                    .min(Comparator.comparingInt(Integer::intValue))
                    .orElse(null);
        }
    }
}
