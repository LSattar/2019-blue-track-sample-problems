//Leah Blue #2
package consecutive.numbers;

import java.util.Scanner;

public class ConsecutiveNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your numbers separated by a space");
        Scanner s = new Scanner(System.in);
        String nums = s.nextLine();
        String[] array = (nums.split(" "));
        int numbers[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(array[i]);
            numbers[i] = num;
        }
        boolean found = false;
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int lastnum = numbers[i];
            int nextnum = numbers[i + 1];
            if (lastnum == nextnum) {
                count++;
            } else {
                count = 0;
            }
            if (count == 2) {
                found = true;
                System.out.println("Consecutive values found for " + lastnum);
            }
        }
        if (found == false) {
            System.out.println("Consecutive values not found");
        }
    }

}
