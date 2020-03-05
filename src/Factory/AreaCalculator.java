package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AreaCalculator {
    public void callMethodsCalculate() throws NumberFormatException, IOException {

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
        if ((i > 4) || (i < 1)) {
            System.out.println("It's bad =(");
            System.exit(0);
        }

        HashMap<Object, Object> myMap = new HashMap<>();

        try {
            ICalculator square = calculatorFactory.getFigure(FigureTypes.SQUARE);
            ICalculator rectangle = calculatorFactory.getFigure(FigureTypes.RECTANGLE);
            ICalculator circle = calculatorFactory.getFigure(FigureTypes.CIRCLE);
            ICalculator triangle = calculatorFactory.getFigure(FigureTypes.TRIANGLE);



            switch (i) {
                case 1:
                    myMap.put("type", "square");
                    square.calculate(myMap);
                    break;
                case 2:
                    myMap.put("type", "rectangle");
                    rectangle.calculate(myMap);
                    break;
                case 3:
                    myMap.put("type", "circle");
                    circle.calculate(myMap);
                    break;
                case 4:
                    myMap.put("type", "triangle");
                    triangle.calculate(myMap);
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