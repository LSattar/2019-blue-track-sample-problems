//Leah Blue #8
package island.hopping;

import java.util.Scanner;
import java.util.ArrayList;

public class IslandHopping {

    public static void main(String[] args) {
        System.out.println("Enter number of islands followed by each jump value");
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        String nums = s.nextLine();
        String[] array = (nums.split(" "));
        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(array[i]);
            numbers.add(num);
        }
        int jumplength = numbers.get(0);
        int island = numbers.get(jumplength);
        int index = jumplength + island;
        boolean pass = true;
        while (jumplength != 0 && index != numbers.size()) {
            if (index == numbers.size() - 1) {
                break;
            }
            if (index > numbers.size() - 1) {
                pass = false;
                break;
            }
            jumplength = numbers.get(index);
            if (jumplength == 0) {
                pass = false;
                break;
            }
            island = numbers.get(index);
            index = jumplength + island;
            if (index > numbers.size() - 1) {
                pass = false;
                break;
            }
        }
        if (pass == true) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

    }

}
