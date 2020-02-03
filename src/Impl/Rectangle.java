package Impl;

import Factory.Calculatable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle implements Calculatable {
    @Override
    public void calculate() {
        double length;
        double width;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader brLength = new BufferedReader(isr);
            System.out.println("Enter length and width rectangle");
            length = Double.parseDouble(bufferedReaderReadLine(brLength));
            BufferedReader brWidth = new BufferedReader(isr);
            width = Double.parseDouble(bufferedReaderReadLine(brWidth));
            double square = calculateArea(length, width);
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
