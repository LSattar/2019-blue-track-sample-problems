//Leah Blue #5
package array.filter;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFilter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> answers = new ArrayList();
        System.out.println("Enter filter size");
        int shift = s.nextInt();
        s.nextLine();
        System.out.println("Enter size of array");
        int size = s.nextInt();
        s.nextLine();
        System.out.println("Enter integers separated by space:");
        String nums = s.nextLine();
        String[] array = (nums.split(" "));
        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(array[i]);
            numbers.add(num);
        }
        for (int i = 0; i < size - shift + 1; i++) {
            int lowestnumber = numbers.get(i);
            for (int n = i; n < shift + i && n < numbers.size(); n++) {
                // System.out.println("searching for lower number: " + lowestnumber);
                if (lowestnumber > numbers.get(n)) {
                    //System.out.println(numbers.get(n)+" is lower than " +lowestnumber);
                    lowestnumber = numbers.get(n);
                }

            }
            if (i == numbers.size()) {
                break;
            }
            answers.add(lowestnumber);
        }
        for (Integer se : answers) {
            System.out.print(se + " ");
        }
    }

}
