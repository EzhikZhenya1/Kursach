package Impl;

import Factory.ICalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Circle implements ICalculator {
    @Override
    public void calculate(HashMap<Object, Object> map) {

        double radius;
        double pi = Math.PI;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader brRadius = new BufferedReader(isr);
            System.out.println("Enter circle's radius");
            radius = Double.parseDouble(bufferedReaderReadLine(brRadius));
            map.put(2, radius);
            double circle = calculateArea(pi, radius);
            map.put(3, circle);
            System.out.printf("rezalt %f\n", circle);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    double calculateArea(double pi, double radius) {
        return (pi * (radius * radius));
    }

    private static String bufferedReaderReadLine(BufferedReader br) throws IOException {
        return br.readLine();
    }
}
