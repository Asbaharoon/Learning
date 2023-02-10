package edu.leetcode;

//1342. Number of Steps to Reduce a Number to Zero

public class NumberOfStepsToReduceANumberToZero {

    /*int answer = 0;
    public void reduce(int num){
        if (num == 0) return;
        answer++;
        if (num % 2 == 0) num /= 2;
        else num--;
        reduce(num);
    }*/

    public static int numberOfSteps(int num) {
        //reduce(num);
        //return answer;

        /*int count=0;
        while(num>0){
            count++;
            num=((num&1)!=0)?num-1:num>>1;
        }
        return count;*/
        return Integer.toBinaryString(num).length() - 1 + Integer.bitCount(num);
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(20));
    }
}
