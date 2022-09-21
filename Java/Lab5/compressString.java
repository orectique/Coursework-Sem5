/*4. Given a string S of lowercase English alphabets of length N. You need to compress the string with the following rules:
    a.	Convert the first letter to the uppercase
    b.	Convert the substring consisting of all the consonants to the length of this substring (e.g. abcde to a3e)
    c.	Remove the consecutive duplicate vowels (e.g. aaaeiia to aeia) */

package Lab5;

import java.util.Scanner;

public class compressString {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    static int[] getFlags (StringBuilder str) {
        int consts[] = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (!isVowel(str.charAt(i))) {
                consts[i] = 1;
            } else if (i > 0 && isVowel(str.charAt(i)) && str.charAt(i - 1) == str.charAt(i)) {
                consts[i] = 2;
            } else {
                consts[i] = 0;
            }
        }

        return consts;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            String strIn = input.nextLine();

            System.out.println(strIn);

            StringBuilder str = new StringBuilder(strIn);

            int consts[] = getFlags(str);

            String out = "";

            for (int i = 0; i < str.length(); i++) {
                if (consts[i] != 2) {
                    out = out + str.charAt(i);
                }
            }
            
            str = new StringBuilder(out);

            consts = getFlags(str);

            String temp = "";
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                System.out.println(str);
                if (consts[i] == 0) {
                    temp = temp + str.charAt(i);
                    count = 0;
                } else if (consts[i] == 1) {
                    count = count + 1;

                    if (consts[i + 1] == 0) {
                        temp = temp + String.valueOf(count);
                    }

                    str = str.deleteCharAt(i);                    
                }
            }

            String str1 = str.toString();

            str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);

            System.out.println(str1.toString());
        }
    }
}
