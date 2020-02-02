import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCalculator {
    public void calculate() throws NumberFormatException, IOException {

        MethodsForArea area = new MethodsForArea();

        String c1 = "square";
        String c2 = "rectangle";
        String c3 = "circle";
        String c4 = "triangle";
        String c5 = "calculate";
        String ch = "enter";

        line(c5, c1, ch, "1");
        line(c5, c2, ch, "2");
        line(c5, c3, ch, "3");
        line(c5, c4, ch, "4");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int i = 0;
        try {
            i = Integer.parseInt(bufferedReaderReadLine(br));
        } catch (NumberFormatException nfe) {
            System.out.println("It's bad =(");
            System.exit(0);
        }
        if ((i > 4) || (i < 1)) {
            System.out.println("It's bad =(");
            System.exit(0);
        }

        double radius;
        double length;
        double width;
        double height;
        double perimeter;
        double pi = Math.PI;

        switch (i) {
            case 1:
                BufferedReader br1 = new BufferedReader(isr);
                System.out.println("Enter length square");
                length = Double.parseDouble(bufferedReaderReadLine(br1));
                double square = area.calculateArea(length);
                System.out.printf("rezalt %f\n", square);
            case 2:
                BufferedReader br2 = new BufferedReader(isr);
                System.out.println("Enter length rectangle");
                length = Double.parseDouble(bufferedReaderReadLine(br2));
                BufferedReader br3 = new BufferedReader(isr);
                width = Double.parseDouble(bufferedReaderReadLine(br3));
                double rectangle = area.calculateArea(length, width);
                System.out.printf("rezalt %f\n", rectangle);
            case 3:
                BufferedReader br4 = new BufferedReader(isr);
                System.out.println("Enter circle's radius");
                radius = Double.parseDouble(bufferedReaderReadLine(br4));
                double r1 = radius;
                double circle = area.calculateArea(pi, radius, r1);
                System.out.printf("rezalt %f\n", circle);
            case 4:
                System.out.println("Enter length three sides of triangle");
                BufferedReader br6 = new BufferedReader(isr);
                length = Double.parseDouble(bufferedReaderReadLine(br6));
                BufferedReader br7 = new BufferedReader(isr);
                width = Double.parseDouble(bufferedReaderReadLine(br7));
                BufferedReader br8 = new BufferedReader(isr);
                height = Double.parseDouble(bufferedReaderReadLine(br8));
                perimeter = 0.5 * (length + width + height);
                double triangle = area.calculateArea(perimeter, length, width, height);
                System.out.printf("rezalt %f\n", triangle);
        }
    }

    private void line(String line1, String line2, String line3, String number) {
        System.out.printf("%s %s, %s %s\n", line1, line2, line3, number);
    }

    private static String bufferedReaderReadLine(BufferedReader br) throws IOException {
        return br.readLine();
    }
}
