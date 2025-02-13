package Lab09;

class IllegalTriangleException extends Triangle {
    private double side1 ;
    private double side2 ;
    private double side3 ;

    public IllegalTriangleException(String message , double side1 , double side2 , double side3) {
        super(message) ;
        this.side1 = side1 ;
        this.side1 = side2 ;
        this.side3 = side3 ;

        
    }
    
}
