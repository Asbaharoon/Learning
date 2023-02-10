package leetcode;

// 383. Ransom Note

import java.util.Scanner;

public class RansomNote {

    public static boolean canConstruct() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Type ransomNote");
            String ransomNote = scanner.nextLine().toLowerCase();
            System.out.println("Type magazine");
            String magazine = scanner.nextLine().toLowerCase();

            if (magazine.length() < ransomNote.length()) return false;
            int [] base = new int[26];
            for (int i = 0; i < magazine.length(); i++) {
                if (i < ransomNote.length()) base[ransomNote.charAt(i) - 'a']--;
                base[magazine.charAt(i) - 'a']++;
            }
            boolean answer = true;
            for (int value: base){
                if (value < 0) {
                    answer = false;
                    break;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(RansomNote.canConstruct());
    }

}
