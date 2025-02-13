package Lab09;

class Triangle {
    private double side1 ;
    private double side2 ;
    private double side3 ;

    public Triangle(double side1, double side2, double side3) throws  IllegalTriangleException {

        this.side1 = side1 ;
        this.side1 = side2 ;
        this.side3 = side3 ;

        if (side1 <= 0.0 || side2 <= 0.0 || side3 <= 0.0) {
            throw new IllegalTriangleException("All sides must be positive", side1, side2, side3) ;
        }
        
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleException("The sum of any two sides must be greater than the other side", side1, side2, side3) ;
        }
    }

    public double getSide1() {
        return side1 ;
    }

    public double getSide2() {
        return side2 ;
    }

    public double getSide3() {
        return side3 ;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getArea() {
        double side = getPerimeter() / 2; 
        return Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
    
    }
}