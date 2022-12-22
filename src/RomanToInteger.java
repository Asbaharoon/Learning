public class RomanToInteger {
    public static int convertChar(char c) {
        int value = 0;
        switch (c) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        }
        return value;
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
            if (i >= 1){
                if (sToInt[i - 1] >= sToInt[i]) {
                    answer += sToInt[i];
                } else {
                    answer += (sToInt[i] - sToInt[i - 1]);
                    i++;
                }
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
