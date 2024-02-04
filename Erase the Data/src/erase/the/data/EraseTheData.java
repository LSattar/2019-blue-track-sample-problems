//Leah Blue#3
package erase.the.data;

import java.util.Scanner;

public class EraseTheData {

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
        int erasetime = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            int size = numbers[i];
            int rate = numbers[i + 1];
            erasetime += size / rate;
        }
        System.out.println(erasetime + " seconds");
    }

}
