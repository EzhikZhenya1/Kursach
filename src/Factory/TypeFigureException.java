package Factory;

class TypeFigureException extends Exception {
    private FigureTypes type;
    public FigureTypes getType(){
        return type;
    }
    public TypeFigureException(String message, FigureTypes type){
        super(message);
        this.type=type;
    }
}
