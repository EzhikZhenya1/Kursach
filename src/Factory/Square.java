package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square implements Calculatable {
    @Override
    public void calculate() {
        double length;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter length square");

        try {
            length = Double.parseDouble(br.readLine());
            double square = calculateArea(length);
            System.out.printf("rezalt %f\n", square);
            System.out.println("square");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    double calculateArea(double lenght) {
        return (Math.pow(lenght, 2));
    }
}
