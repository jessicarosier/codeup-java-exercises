package shapes;

import java.security.MessageDigest;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Square(4);
//        Measurable myShape = new Rectangle(2, 3);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Quadrilateral test = new Square(5);
        System.out.println(test.width);

        Rectangle myRec = new Rectangle(2,3);
        System.out.println(myRec.getPerimeter());


    }
}
