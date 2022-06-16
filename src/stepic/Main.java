package stepic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] numbers = new int[]{1, 25, 3, 9, 2, 6, 5, 0};
//        int index = numbers.length - 1;
//        while (index >= 0) {
//            System.out.print(numbers[index] + ",");
//            index = index - 1;
//        }
//
//    }
//}


        int[] numbers = new int[]{50, 1, 25, 0, 9, 2, 6, 5, 6};
        int index = 0;
        double sum = 0;
        while (index < numbers.length) {
            sum = sum + numbers[index];

            index = index + 1;
        }
        System.out.println(sum / numbers.length);
    }
}


