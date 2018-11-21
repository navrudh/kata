package eopi.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class AmericanFootballCombinations {

    private static int numberOfCombinations(final int finalScore, final List<Integer> individualPlayScores) {
        int[][] combinations = new int[individualPlayScores.size()][finalScore + 1];

        for (int i = 0; i < individualPlayScores.size(); ++i) {
            combinations[i][0] = 1;
            for (int j = 1; j <= finalScore; ++j) {
                // possibility of playing i th play, from j-i th score, final score = j
                int excludingPlay = (i - 1) >= 0 ? combinations[i - 1][j] : 0;
                int includingPlay = j >= individualPlayScores.get(i) ?
                        combinations[i][j - individualPlayScores.get(i)] : 0;
                combinations[i][j] = excludingPlay + includingPlay;
            }
        }

        return combinations[individualPlayScores.size() - 1][finalScore];
    }

    private static int numberOfCombinationsSpaceOptimized(final int finalScore, final List<Integer> individualPlayScores) {
        int[] combinations = new int[finalScore + 1];
        combinations[0] = 1;

        for (Integer individualPlayScore : individualPlayScores) {
            for (int j = 1; j <= finalScore; ++j) {
                // possibility of playing i th play, j-i th score, final score = j
                if (j >= individualPlayScore)
                    combinations[j] += combinations[j - individualPlayScore];
            }
        }

        return combinations[finalScore];
    }

    public static void main(String[] args) {

        System.out.println("Number Of Combinations:");
        System.out.println("=======================");
        System.out.println("Default");
        System.out.println(numberOfCombinations(12, Arrays.asList(7, 2, 3)));
        System.out.println(numberOfCombinations(12, Arrays.asList(2, 3, 7)));
        System.out.println(numberOfCombinations(24, Arrays.asList(2, 3, 7)));

        System.out.println("Variant 1: O(n) Space:");
        System.out.println(numberOfCombinationsSpaceOptimized(12, Arrays.asList(7, 2, 3)));
        System.out.println(numberOfCombinationsSpaceOptimized(12, Arrays.asList(2, 3, 7)));
        System.out.println(numberOfCombinationsSpaceOptimized(24, Arrays.asList(2, 3, 7)));

    }
}
