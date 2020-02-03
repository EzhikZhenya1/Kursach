package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCalculator {
    public void callMethodsCalculate() throws NumberFormatException, IOException {

        String c1 = "square";
        String c2 = "rectangle";
        String c3 = "circle";
        String c4 = "triangle";
        String c5 = "calculate";
        String c6 = "lil";
        String ch = "enter";

        line(c5, c1, ch, "1");
        line(c5, c2, ch, "2");
        line(c5, c3, ch, "3");
        line(c5, c4, ch, "4");
        line(c5, c6, ch, "5");


        CalculatorFactory calculatorFactory = new CalculatorFactory();


        int i = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String number = br.readLine();
        try {
            i = Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            System.out.println("It's bad =(");
            System.exit(0);
        }
        if ((i > 5) || (i < 1)) {
            System.out.println("It's bad =(");
            System.exit(0);
        }

        try {
            Calculatable square = calculatorFactory.getFigure(FigureTypes.SQUARE);
            Calculatable rectangle = calculatorFactory.getFigure(FigureTypes.RECTANGLE);
            Calculatable circle = calculatorFactory.getFigure(FigureTypes.CIRCLE);
            Calculatable triangle = calculatorFactory.getFigure(FigureTypes.TRIANGLE);
            Calculatable lil = calculatorFactory.getFigure(FigureTypes.LIL);

            switch (i) {
                case 1:
                    square.calculate();
                    break;
                case 2:
                    rectangle.calculate();
                    break;
                case 3:
                    circle.calculate();
                    break;
                case 4:
                    triangle.calculate();
                    break;
                case 5:
                    lil.calculate();
                    break;
            }
        } catch (TypeFigureException ex){
            System.out.println(ex.getMessage() + ex.getType());
        }

    }

    private void line(String line1, String line2, String line3, String number) {
        System.out.printf("%s %s, %s %s\n", line1, line2, line3, number);
    }
}