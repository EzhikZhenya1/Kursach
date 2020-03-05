package Impl;

import Factory.ICalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Triangle implements ICalculator {
    @Override
    public void calculate(HashMap<Object, Object> map) {
        double first;
        double second;
        double third;
        double perimeter;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);

            System.out.println("Enter length three sides of triangle");
            BufferedReader brFirst = new BufferedReader(isr);
            first = Double.parseDouble(bufferedReaderReadLine(brFirst));
            map.put(2, first);
            BufferedReader brSecond = new BufferedReader(isr);
            second = Double.parseDouble(bufferedReaderReadLine(brSecond));
            map.put(3, second);
            BufferedReader brThird = new BufferedReader(isr);
            third = Double.parseDouble(bufferedReaderReadLine(brThird));
            map.put(4, third);
            perimeter = 0.5 * (first + second + third);
            map.put(5, perimeter);
            double square = calculateArea(perimeter, first, second, third);
            map.put(6, square);
            System.out.printf("rezalt %f\n", square);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    double calculateArea(double perimeter, double first, double second, double third) {
        return (Math.sqrt(perimeter * (perimeter - first) * (perimeter - second) * (perimeter - third)));
    }

    private static String bufferedReaderReadLine(BufferedReader br) throws IOException {
        return br.readLine();
    }
}
