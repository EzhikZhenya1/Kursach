package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle implements Calculatable {
    @Override
    public void calculate() {
        double first;
        double second;
        double third;
        double perimeter;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);

            System.out.println("Enter length three sides of triangle");
            BufferedReader brFirst = new BufferedReader(isr);
            first = Double.parseDouble(bufferedReaderReadLine(brFirst));
            BufferedReader brSecond = new BufferedReader(isr);
            second = Double.parseDouble(bufferedReaderReadLine(brSecond));
            BufferedReader brThird = new BufferedReader(isr);
            third = Double.parseDouble(bufferedReaderReadLine(brThird));
            perimeter = 0.5 * (first + second + third);
            double triangle = calculateArea(perimeter, first, second, third);
            System.out.printf("rezalt %f\n", triangle);

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
