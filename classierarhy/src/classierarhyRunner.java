package classierarhy.src;

public class classierarhyRunner {
    public static void main(String[] args) {
        Cylinder cylyinder = new Cylinder(2, 2);
        Pyramid pyramid = new Pyramid(100, 100);

        Box box = new Box(1000);

        System.out.println(box.add(cylyinder)); // ok
        System.out.println(box.add(pyramid)); // failed

    }
}
