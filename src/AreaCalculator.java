import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCalculator {
    public void calculate() throws NumberFormatException, IOException {

        MethodsForArea area = new MethodsForArea();

        double radius;
        double length;
        double width;
        double height;
        double perimeter = 0;
        double pi = Math.PI;

        String c1 = "square";
        String c2 = "rectangle";
        String c3 = "circle";
        String c4 = "triangle";
        String c5 = "calculate";
        String ch = "enter";

        line(c5, c1, ch, "1");
        line(c5, c2, ch, "2");
        line(c5, c2, ch, "3");
        line(c5, c2, ch, "4");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String brLine = br.readLine();
        int i = 0;
        try {
            i = Integer.parseInt(brLine);
        } catch (NumberFormatException nfe) {
            System.out.println("It's bad =(");
            System.exit(0);
        }
        if ((i > 4) || (i < 1)) {
            System.out.println("It's bad =(");
            System.exit(0);
        }

        switch (i) {
            case 1:
                BufferedReader br1 = new BufferedReader(isr);
                System.out.println("Enter length square");
                length = Double.parseDouble
                        (br1.readLine());
                System.out.printf("rezalt %f\n", area.calculateArea(length));
            case 2:
                BufferedReader br2 = new BufferedReader(isr);
                System.out.println("Enter length rectangle");
                length = Double.parseDouble
                        (br2.readLine());
                BufferedReader br3 = new BufferedReader(isr);
                width = Double.parseDouble
                        (br3.readLine());
                System.out.printf("rezalt %f\n", area.calculateArea(length, width));
            case 3:
                BufferedReader br4 = new BufferedReader(isr);
                System.out.println("Enter circle's radius");
                radius = Double.parseDouble
                        (br4.readLine());
                double r1 = radius;
                System.out.printf("rezalt %f\n", area.calculateArea(pi, radius, r1));
            case 4:
                System.out.println("Enter length three sides of triangle");
                BufferedReader br6 = new BufferedReader(isr);
                length = Double.parseDouble
                        (br6.readLine());
                BufferedReader br7 = new BufferedReader(isr);
                width = Double.parseDouble
                        (br7.readLine());
                BufferedReader br8 = new BufferedReader(isr);
                height = Double.parseDouble
                        (br8.readLine());
                perimeter = 0.5 * (length + width + height);
                System.out.printf("rezalt %f\n", area.calculateArea(perimeter, length, width, height));
        }
    }

    private void line(String line1, String line2, String line3, String number) {
        System.out.printf("%s %s, %s %s\n", line1, line2, line3, number);
    }
}
