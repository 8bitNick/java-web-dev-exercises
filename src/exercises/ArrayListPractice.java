package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        evensOnly(nums);

        ArrayList<String> strings = new ArrayList<>();
        fiveLetters(strings);
    }

    private static void evensOnly(ArrayList<Integer> someNumbers) {
        for (Integer number : someNumbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void fiveLetters(ArrayList<String> someStrings) {
        String newString;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a new string, or ENTER to finish");

        do {
            newString = input.nextLine();

            if (!newString.equals("")) {
                someStrings.add(newString);
            }
        } while(!newString.equals(""));

        for (String string : someStrings) {
            if (string.length() == 5) {
                System.out.println(string);
            }
        }
    }
}


