package LC;

// 383. Ransom Note

import java.util.Scanner;

public class RansomNote {
    public static boolean canConstruct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type ransomNote");
        String ransomNote = scanner.nextLine().toLowerCase();
        System.out.println("Type magazine");
        String magazine = scanner.nextLine().toLowerCase();

        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(RansomNote.canConstruct());
    }

}
