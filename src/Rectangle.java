public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(int posx, int posy, String colour, int height, int width) {
        super(posx, posy, colour);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with size " + height + " x " + width);
    }
}
