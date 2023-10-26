package lab03;

class Square extends Form {
    private float side;

    public Square() {
        side = 0.0f;
    }
    
    public Square(String str, float s) {
        super(str);
        side = s;
    }
    @Override
    public String toString() {
        return "Square: " + super.toString();
    }

    @Override
    public float getArea(){
        return side * side;
    }
    
    public void printSquareDimensions() {
        System.out.println("Side: " + side);
    }
    
    @Override
    public void printDimensions() {
        this.printSquareDimensions();
    }
}