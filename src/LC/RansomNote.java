package LC;

// 383. Ransom Note

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    public static boolean canConstruct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type ransomNote");
        String ransomNote = scanner.nextLine();
        System.out.println("Type magazine");
        String magazine = scanner.nextLine();

        HashMap base = new HashMap();
        //return magazine.contains(ransomNote);

        for (int i = 0; i < magazine.length(); i++){
            int ammount = 1;
            if (base.containsKey(magazine.charAt(i))){
                ammount = (int) base.get(magazine.charAt(i));
                ammount++;
                base.replace(magazine.charAt(i),ammount);
            }
            else base.put(magazine.charAt(i),ammount);
        }

        for (int i = 0; i < ransomNote.length(); i++){
            int ammount = -1;
            if (base.containsKey(ransomNote.charAt(i))){
                ammount = (int) base.get(ransomNote.charAt(i));
                ammount--;
                base.replace(ransomNote.charAt(i),ammount);
            }
            else base.put(ransomNote.charAt(i),ammount);
        }

        boolean answer = true;

        for (Object value: base.values()){
            if ((int) value < 0) answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(RansomNote.canConstruct());
    }

}
