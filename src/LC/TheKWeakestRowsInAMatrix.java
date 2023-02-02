package LC;

import java.util.*;

public class TheKWeakestRowsInAMatrix {
    /*
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
            //
            // we can create a score to match the sort condition from description
            // score = soldiersCount * rows + currentRowIndex
            // so we can get soldiersCount by score / rows, and get rowIndex by score % rows
            // hash score and rows
            //
            score[i] = j * rows + i;
        }

        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) {
            // get rowIndex
            score[i] = score[i] % rows;
        }

        return Arrays.copyOfRange(score, 0, k);
    }
    */

    /*public static void sortingWeakest(int[][]force){
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

    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] force = new int[2][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) force[0][i] += mat[i][j];
            }
            force[1][i] = i;
        }

        sortingWeakest(force);

        int[] answer = new int[k];
        System.arraycopy(force[1], 0, answer, 0, k);

        return answer;
    }*/

    /*public static void sortingWeakest(int[]force){
        boolean sorted = true;
        for (int i = 0; i < force.length - 1; i++){
            if (force[i] > force[i + 1]){
                sorted = false;
                break;
            }
        }
        if (!sorted){
            for (int i = 0; i < force.length - 1; i++){
                if (force[i] > force[i + 1]){
                    int temp = force[i];
                    force[i] = force[i + 1];
                    force[i + 1] = temp;
                }
            }
            sortingWeakest(force);
        }
    }


    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] force = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) force[i] += mat[i][j];
            }
            force[i] = force[i] * mat.length + i;
        }

        sortingWeakest(force);

        int[] answer = new int[k];

        for (int i = 0; i < k; i++){
            answer[i] = force[i] % mat.length;
        }

        return answer;
    }*/

    /*public static int[] kWeakestRows(int[][] mat, int k) {
        int[] force = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) force[i] += mat[i][j];
            }
        }
        int[] answer = new int[k];

        for (int i = 0; i < k; i++){
            int min = mat[0].length + 1;
            int index = 0;
            for (int j = 0; j < force.length; j++){
                if (force[j] < min){
                    index = j;
                    min = force[j];
                }
            }
            answer[i] = index;
            force[index] = mat[0].length + 1;
        }

        return answer;
    }*/
    public static int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int res[]=new int[k];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)
                    count++;
                else break;
            }
            map.put(i,count);
        }

        List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b){
                if(a.getValue()==b.getValue())
                    return a.getKey()-b.getKey();
                return a.getValue()-b.getValue();
            }
        });
        int i=0;
        for(Map.Entry<Integer,Integer> mp:list)
        {
            res[i++]=mp.getKey();
            if(i==k)
                break;
        }
        return res;
    }


    public static void main(String[] args) {
        int [][] mat = {{1,1,1,0,0,0,0},{1,1,1,1,1,1,0},{0,0,0,0,0,0,0},{1,1,1,0,0,0,0},{1,1,1,1,1,1,1}};
        int k = 4;
        for (int element : TheKWeakestRowsInAMatrix.kWeakestRows(mat,k)){
            System.out.println(element);
        }

    }

}
