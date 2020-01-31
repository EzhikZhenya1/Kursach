import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCalculation {
    public void main() throws NumberFormatException, IOException{

        MethodsAreaCalculation area = new MethodsAreaCalculation();

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

        int i = 0;

        System.out.printf (" %s %s, enter 1\n\n", c5, c1);
        System.out.printf ("%s  %s, %s 2\n\n", c5, c2, ch);
        System.out.printf("%s  %s, %s 3\n\n", c5, c3, ch);
        System.out.printf("%s %s, %s 4\n\n", c5, c4, ch);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            i = Integer.parseInt(br.readLine());
        }catch (NumberFormatException nfe){
            System.out.println("It's bad =(");
            System.exit(0);
        }
        if((i > 4) || (i < 1)){
            System.out.println("It's bad =(");
            System.exit(0);
        }

        if(i==1) {
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter length square");
            length = Double.parseDouble(br1.readLine());
            System.out.printf("rezalt %f\n", area.area(length));
        }
        if(i==2) {
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter length rectangle");
            length = Double.parseDouble(br2.readLine());
            BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
            width = Double.parseDouble(br3.readLine());
            System.out.printf("rezalt %f\n", area.area(length, width));
        }
        if(i==3) {
            BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter circle's radius\n\n");
            radius = Double.parseDouble(br4.readLine());
            double r1 = radius;
            System.out.printf("rezalt %f\n", area.area(pi, radius, r1));
        }
        if(i==4) {
            System.out.println("Enter length three sides of triangle\n\n");
            BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
            length = Double.parseDouble(br6.readLine());
            BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));
            width = Double.parseDouble(br7.readLine());
            BufferedReader br8 = new BufferedReader(new InputStreamReader(System.in));
            height = Double.parseDouble(br8.readLine());
            perimeter = 0.5 * (length + width + height);
            //Печать результата с вызовом функции
            System.out.printf("rezalt %f\n", area.area(perimeter, length, width, height));
        }
    }
}
