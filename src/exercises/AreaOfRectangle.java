package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;

        System.out.println("What's the length?");
        double length = input.nextDouble();
        System.out.println("What's the width?");
        double width = input.nextDouble();

        area = length * width;
        System.out.println("Rectangle of length " + length + " and width " + width + " equals " + area + "!");

    }
}