public class MethodsForArea {
    double calculateArea(double lenght) {
        return (Math.pow(lenght, 2));
    }

    //Функция вычисления площади прямоугольника

    double calculateArea(double lenght, double width) {
        return lenght * width;
    }

    //Функция вычисления площади круга

    double calculateArea(double pi, double radius, double r1) {
        return (pi * (radius * r1));
    }

    //Функция вычисления площади треугольника

    double calculateArea(double perimeter, double first, double second, double third) {
        return (Math.sqrt(perimeter * (perimeter - first) * (perimeter - second) * (perimeter - third)));
    }
}
