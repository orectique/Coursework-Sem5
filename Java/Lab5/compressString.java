/*4. Given a string S of lowercase English alphabets of length N. You need to compress the string with the following rules:
    a.	Convert the first letter to the uppercase
    b.	Convert the substring consisting of all the consonants to the length of this substring (e.g. abcde to a3e)
    c.	Remove the consecutive duplicate vowels (e.g. aaaeiia to aeia) */

package Lab5;

import java.util.Scanner;
import java.util.Arrays;

public class compressString {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            String strIn = input.nextLine();

            System.out.println(strIn);

            strIn = strIn.substring(0, 1).toUpperCase() + strIn.substring(1);

            StringBuilder str = new StringBuilder(strIn);

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

            String out = "";

            for (int i = 0; i < str.length(); i++) {
                if (consts[i] != 2) {
                    out = out + str.charAt(i);
                }
            }
            
            str = new StringBuilder(out);

            for (int i = 0; i < str.length(); i++) {
                if (consts[i] == 1) {
                    int count = 0, temp = i;
                    for (int j = i; j < str.length(); j++) {
                        if (!isVowel(str.charAt(j))) {
                            count++;
                        } else {
                            temp = j;
                            break;
                        }
                    }

                    if (count > 1) {
                        str.replace(i, temp, String.valueOf(count));
                    }
                }
            }

            System.out.println(Arrays.toString(consts));

            System.out.println(str.toString());


        }
    }
}
