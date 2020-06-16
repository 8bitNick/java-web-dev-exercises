package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double milesDriven;
        Double gasConsumed;
        double milesPerGallon;

        System.out.println("How many miles have you driven?");
        milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed?");
        gasConsumed = input.nextDouble();

        milesPerGallon = milesDriven / gasConsumed;

        System.out.println("You are achieving " + milesPerGallon + " miles per gallon!");
    }
}
