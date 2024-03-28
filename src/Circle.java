public class Circle extends Shape {
    int radius;

    public Circle(int posx, int posy, String colour, int radius) {
        super(posx, posy, colour);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with radius " + radius);
    }
}
