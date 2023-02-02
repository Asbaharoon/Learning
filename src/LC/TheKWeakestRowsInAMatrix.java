package LC;

public class TheKWeakestRowsInAMatrix {

    public static void sortingWeakest(int[][]force){
        boolean sorted = true;
        for (int i = 0; i < force[0].length - 1; i++){
            if (force[0][i] > force[0][i + 1]){
                sorted = false;
                break;
            }
        }
        if (!sorted){
            for (int i = 0; i < force[0].length - 1; i++){
                if (force[0][i] > force[0][i + 1]){
                    int temp = force[0][i];
                    force[0][i] = force[0][i + 1];
                    force[0][i + 1] = temp;

                    temp = force[1][i];
                    force[1][i] = force[1][i + 1];
                    force[1][i + 1] = temp;
                }
            }
            sortingWeakest(force);
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[][] force = new int[2][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                force[0][i] += mat[i][j];
            }
            force[1][i] = i;
        }

        sortingWeakest(force);

        int[] answer = new int[k];
        System.arraycopy(force[1], 0, answer, 0, k);

        return answer;
    }

    public static void main(String[] args) {
        int [][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        for (int element : TheKWeakestRowsInAMatrix.kWeakestRows(mat,k)){
            System.out.println(element);
        }

    }

}
