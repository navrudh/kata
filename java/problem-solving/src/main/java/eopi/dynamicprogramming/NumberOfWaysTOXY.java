package eopi.dynamicprogramming;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfWaysTOXY {

    private static int numberOfWaysFromTo(int x1, int y1, int x2, int y2) {
        return numberOfWays(Math.abs(x2 - x1), Math.abs(y2 - y1));
    }

    private static int numberOfWays(int n, int m) {
        return computeNumberOfWaysToXY(n - 1, m - 1, new int[n][m]);
    }

    private static int computeNumberOfWaysToXY(int x, int y, int[][] numberOfWays) {
        if (x == 0 || y == 0) return 1;
        if (numberOfWays[x][y] == 0) {
            int waysTop = computeNumberOfWaysToXY(x - 1, y, numberOfWays);
            int waysLeft = computeNumberOfWaysToXY(x, y - 1, numberOfWays);
            numberOfWays[x][y] = waysTop + waysLeft;
        }
        return numberOfWays[x][y];
    }

    public static void main(String[] args) {
        assertThat(numberOfWays(2, 3)).isEqualTo(3);
        assertThat(numberOfWays(4, 3)).isEqualTo(10);
        assertThat(numberOfWays(5, 5)).isEqualTo(70);

        assertThat(numberOfWaysFromTo(2, 3, 4, 6)).isEqualTo(3);
        assertThat(numberOfWaysFromTo(4, 3, 8, 6)).isEqualTo(10);
        assertThat(numberOfWaysFromTo(15, 20, 20, 15)).isEqualTo(70);
    }
}
