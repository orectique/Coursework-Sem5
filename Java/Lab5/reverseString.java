/*1.Write a program to print the text in reverse order by interchanging the position of the words. The text / line has to be accepted as user Input 
 */

package Lab5;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str = input.nextLine();
            str = str.trim();
            String reverse = "";
            
            String[] split = str.split("[.]", 0);

            for (String sub : split) {
                String[] subSplit = sub.split(" ", 0);  

                String temp = "";
                for (String subSub : subSplit) {
                    temp = subSub + " " + temp;
                }

                reverse += temp.trim() + "." + " ";
            }

            System.out.println(reverse);
        }
    }
}
