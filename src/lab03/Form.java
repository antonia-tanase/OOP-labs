package lab03;

class Form {
    private String color;

    public Form() {
        color = "white";
    }
    
    public Form(String str) {
        color = str;
    }
    
    public String getColor() {
        return color;
    }

    public float getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "This form has the color " + color;
    }
    
    public void printDimensions() {
        System.out.println("No dimensions");
    }
}