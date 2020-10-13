public class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() throws IllegalTriangleException {
        this(0, 0, 0);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
               this.side1 = side1;
               this.side2 = side2;
               this.side3 = side3;

    }

    public void side1(double side1) {
        this.side1 = side1;
    }

    public void side2(double side2) {
        this.side2 = side2;
    }

    public void side3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "created on " + super.getDateCreated() + "\ncolor: " + super.getColor() +
                "\nand filled: " + super.isFilled() + "\nwith a perimeter of " + getPerimeter();
    }
}
