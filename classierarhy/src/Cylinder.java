package classierarhy.src;

public class Cylinder extends SolidOfRevolution { // конкретный класс
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {

        return Math.PI * radius * radius * height;
    }
}