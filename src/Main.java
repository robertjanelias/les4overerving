import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(100, 299, "green", 50);
        Rectangle r1 = new Rectangle(300, 50, "red", 100, 110);
        Shape s1 = new Circle(100, 200, "blue", 10);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(r1);
        shapes.add(s1);

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
