package Factory;

import Impl.Circle;
import Impl.Rectangle;
import Impl.Square;
import Impl.Triangle;

public class CalculatorFactory {
    public ICalculator getFigure(FigureTypes type) throws TypeFigureException {
        ICalculator toReturn;
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
                throw new TypeFigureException("Illigal type ", type);
        }
        return toReturn;
    }
}
