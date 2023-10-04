package shapes;

public class Circle {

    public static void main(String[] args) {
        Circle smallCircle = new Circle(3);
        System.out.println(smallCircle.getArea());
        System.out.println(smallCircle.getCircumference());
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public void getCircleDetails() {
        System.out.printf("You created a circle with a radius of %.1f, an area of %.1f and a circumference of %.1f.\n", this.radius, this.getArea(), this.getCircumference());
    }

}
