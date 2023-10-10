package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }



    @Override
    public double getPerimeter() {
        return 4 * this.width;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    void setLength(double length) {
        this.length = length;

    }

    @Override
    void setWidth(double width) {
     this.width = width;
    }
}
