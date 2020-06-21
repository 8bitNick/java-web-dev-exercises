package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();

        System.out.printf("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
    }
}
