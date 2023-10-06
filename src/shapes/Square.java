package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public double getArea(){
       return Math.pow(length, 2);
    }

    public int getPerimeter() {
        return 4 * width;
    }
}
