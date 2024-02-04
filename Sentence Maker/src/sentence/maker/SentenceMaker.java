//Leah Blue #7
package sentence.maker;

import java.util.Scanner;
import java.util.ArrayList;

public class SentenceMaker {

    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList();
        ArrayList<Character> sentenceletters = new ArrayList();
        System.out.println("Enter the list of letters");
        Scanner s = new Scanner(System.in);
        String l = s.nextLine();
        for (int i = 0; i < l.length(); i++) {
            letters.add(l.charAt(i));
        }
        System.out.println("Enter the sentence to be formed:");
        String sentence = s.nextLine();
        boolean canmake = true;
        for (int i = 0; i < sentence.length(); i++) {
            sentenceletters.add(sentence.charAt(i));
        }
        for (int i = 0; i < sentenceletters.size(); i++) {
            char findchar = sentenceletters.get(i);
            for (int n = 0; n < letters.size(); n++) {
                if (findchar == letters.get(n)) {
                    letters.remove(n);
                    canmake = true;
                    break;
                } else {
                    canmake = false;
                }
            }
        }
        if (canmake == true) {
            System.out.println("possible");
        } else {
            System.out.println("not possible");
        }

    }

}
