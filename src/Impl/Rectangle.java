package Impl;

import Factory.ICalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Rectangle implements ICalculator {
    @Override
    public void calculate(HashMap<Object, Object> map) {
        double length;
        double width;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader brLength = new BufferedReader(isr);
            System.out.println("Enter length and width rectangle");
            length = Double.parseDouble(bufferedReaderReadLine(brLength));
            map.put("lengthOfTheRectangle", length);
            BufferedReader brWidth = new BufferedReader(isr);
            width = Double.parseDouble(bufferedReaderReadLine(brWidth));
            map.put("widthOfTheRectangle", width);
            double square = calculateArea(length, width);
            map.put("areaRectangle", square);
            System.out.printf("rezalt %f\n", square);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    double calculateArea(double lenght, double width) {
        return lenght * width;
    }

    private static String bufferedReaderReadLine(BufferedReader br) throws IOException {
        return br.readLine();
    }
}
