//Leah Blue #4
package lets.make.a.call;

import java.util.Scanner;

public class LetsMakeACall {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a phone number: ");
        StringBuilder number = new StringBuilder();
        String phone = s.nextLine();
        char[] chars = phone.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]) || chars[i] == '-') {
                number.append(chars[i]);
            } else {
                if (chars[i] == 'A' || chars[i] == 'B' || chars[i] == 'C') {
                    chars[i] = '2';
                }
                if (chars[i] == 'D' || chars[i] == 'E' || chars[i] == 'F') {
                    chars[i] = '3';
                }
                if (chars[i] == 'G' || chars[i] == 'H' || chars[i] == 'I') {
                    chars[i] = '4';
                }
                if (chars[i] == 'J' || chars[i] == 'K' || chars[i] == 'L') {
                    chars[i] = '5';
                }
                if (chars[i] == 'M' || chars[i] == 'N' || chars[i] == 'O') {
                    chars[i] = '6';
                }
                if (chars[i] == 'P' || chars[i] == 'Q' || chars[i] == 'R' || chars[i] == 'S') {
                    chars[i] = '7';
                }
                if (chars[i] == 'T' || chars[i] == 'U' || chars[i] == 'V') {
                    chars[i] = '8';
                }
                if (chars[i] == 'W' || chars[i] == 'X' || chars[i] == 'Y' || chars[i] == 'Z') {
                    chars[i] = '9';
                }
                number.append(chars[i]);
            }
        }
        System.out.println(number);
    }

}
