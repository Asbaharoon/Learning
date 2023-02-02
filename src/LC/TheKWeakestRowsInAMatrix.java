package LC;

import java.util.Arrays;

public class TheKWeakestRowsInAMatrix {

    public static int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] score = new int[rows];
        int j;
        for (int i = 0; i < rows; i++) {
            j = 0;
            for (; j < cols; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
            }
            /*
             * we can create a score to match the sort condition from description
             * score = soldiersCount * rows + currentRowIndex
             * so we can get soldiersCount by score / rows, and get rowIndex by score % rows
             * hash score and rows
             */
            score[i] = j * rows + i;
        }

        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) {
            // get rowIndex
            score[i] = score[i] % rows;
        }

        return Arrays.copyOfRange(score, 0, k);
    }

    public static void main(String[] args) {
        int [][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        for (int element : TheKWeakestRowsInAMatrix.kWeakestRows(mat,k)){
            System.out.println(element);
        }

    }

}
