public class MethodsAreaCalculation {
    double area(double lenght)
    {
        return (Math.pow(lenght, 2));
    }

    //Функция вычисления площади прямоугольника

    double area(double lenght, double width)
    {
        return lenght*width;
    }

    //Функция вычисления площади круга

    double area(double pi, double radius, double r1)
    {
        return (pi*(radius*r1));
    }

    //Функция вычисления площади треугольника

    double area(double perimeter, double first, double second, double third) {
        return (Math.sqrt(perimeter * (perimeter - first) * (perimeter - second) * (perimeter - third)));
    }
}
