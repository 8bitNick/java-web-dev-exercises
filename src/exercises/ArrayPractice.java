package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8};
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them " +
                       "in a house. I will not eat them with a mouse.";

        for (int i : nums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String[] spaceDelimQuote = quote.split(" ");
        System.out.println(Arrays.toString(spaceDelimQuote));

        String[] periodDelimQuote = quote.split("\\.");
        System.out.println(Arrays.toString(periodDelimQuote));
    }
}
