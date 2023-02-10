package leetcode;

//1672. Richest Customer Wealth

public class RichestCustomerWealth {
    //class Solution {
        public static int maximumWealth(int[][] accounts) {
            int max = 0;
            for (int i = 0; i < accounts.length; i++){
                int sum = 0;
                for (int j = 0; j < accounts[i].length; j++){
                    sum += accounts[i][j];
                }
                if (sum > max) max = sum;
            }
            return max;
        }
    //}

    public static void main(String[] args) {
            int[][] test = {{1,1},{1,2}};
        System.out.println(maximumWealth(test));
    }
}
