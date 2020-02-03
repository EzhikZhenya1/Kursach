package Factory;

public class CalculatorFactory {
    public Calculatable getFigure(FigureTypes type){
        Calculatable toReturn = null;
        switch (type){
            case SQUARE:
                toReturn = new Square();
                break;
            case RECTANGLE:
                toReturn = new Rectangle();
                break;
            case CIRCLE:
                toReturn = new Circle();
                break;
            case TRIANGLE:
                toReturn = new Triangle();
                break;
            default:
                throw new IllegalArgumentException("Wrong figure type!");
        }
        return toReturn;
    }
}
