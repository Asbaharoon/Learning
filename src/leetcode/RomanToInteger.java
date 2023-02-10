package leetcode;

// 13. Roman to Integer

public class RomanToInteger {
    public static int convertChar(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static int romanToInt(String s) {
        // String s to int array
        int[] sToInt = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int value = convertChar(s.charAt(i));
            sToInt[i] = value;
            //System.out.println(sToInt[i]);
        }
        int answer = 0;
        for (int i = (s.length() - 1); i >= 0; i--) {
            //System.out.println(i);
            if ((i >= 1) && (sToInt[i - 1] < sToInt[i])) {
                answer += (sToInt[i] - sToInt[i - 1]);
                i--;
            } else {
                answer += sToInt[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
