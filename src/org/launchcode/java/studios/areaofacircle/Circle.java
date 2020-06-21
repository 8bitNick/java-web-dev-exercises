package org.launchcode.java.studios.areaofacircle;

import java.lang.Math;

public class Circle {
    public static void main(String[] args) {

    }
    public static Double getArea(Double radius) {
        double area = Math.PI * Math.pow(radius, 2);

        return Math.round(area * 1000d) / 1000d;
    }
}
