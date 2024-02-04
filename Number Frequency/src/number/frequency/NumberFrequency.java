//Leah Blue #1
package number.frequency;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class NumberFrequency {

    int value;
    int occurence;

    NumberFrequency(int value, int occurence) {
        this.value = value;
        this.occurence = occurence;
    }

    public int getValue() {
        return this.value;
    }

    public int getOccurrence() {
        return this.occurence;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your numbers separated by a space");
        Scanner s = new Scanner(System.in);
        String nums = s.nextLine();
        String[] numbers = (nums.split(" "));
        int array[] = new int[numbers.length - 1];
        ArrayList<Integer> checked = new ArrayList();
        ArrayList<NumberFrequency> answers = new ArrayList();
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int num = Integer.parseInt(numbers[i]);
            array[i] = num;
        }
        for (int i = 0; i < array.length; i++) {
            int countnum = array[i];
            if (checked.contains(countnum)) {
                continue;
            } else {
                checked.add(countnum);
            }
            for (int n = i; n < array.length; n++) {
                if (array[n] == countnum) {
                    count++;
                }
            }
            NumberFrequency num = new NumberFrequency(countnum, count);
            answers.add(num);
            count = 0;
        }

        Collections.sort(answers, Comparator.comparing(NumberFrequency::getValue));
        System.out.println(answers);
        for (NumberFrequency f : answers) {
            if (f.getOccurrence() > 1) {
                System.out.println(f.getValue() + " occurs " + f.getOccurrence() + " times");
            } else {
                System.out.println(f.getValue() + " occurs " + f.getOccurrence() + " time");
            }
        }

    }

}
