package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle implements Calculatable {
    @Override
    public void calculate() {

        double radius;
        double pi = Math.PI;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader brRadius = new BufferedReader(isr);
            System.out.println("Enter circle's radius");
            radius = Double.parseDouble(bufferedReaderReadLine(brRadius));
            double circle = calculateArea(pi, radius);
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
