//Leah Blue #6
package your.shift.is.over;

import java.util.Scanner;
import java.util.ArrayList;

public class YourShiftIsOver {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        System.out.println("Enter the shift number");
        int shift = s.nextInt();
        s.nextLine();
        System.out.println("Enter your numbers separated by a space. End with 0");
        String nums = s.nextLine();
        String[] array = (nums.split(" "));
        for (int i = 0; i < array.length - 1; i++) {
            int num = Integer.parseInt(array[i]);
            numbers.add(num);
        }
        for (int i = 0; i < shift; i++) {
            int shiftednumber = numbers.get(0);
            numbers.remove(0);
            numbers.add(shiftednumber);
        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

}
