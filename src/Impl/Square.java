package Impl;

import Factory.ICalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Square implements ICalculator {
    @Override
    public void calculate(HashMap<Object, Object> map) {
        double length;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter length square");

        try {
            length = Double.parseDouble(br.readLine());
            double square = calculateArea(length);
            map.put("lengthOfTheSquare", length);
            System.out.printf("rezalt %f\n", square);
            map.put("areaSquare", square);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    double calculateArea(double lenght) {
        return (Math.pow(lenght, 2));
    }
}
