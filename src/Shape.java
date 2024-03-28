public abstract class Shape {
    int posx;
    int posy;
    String colour;

    public Shape(int posx, int posy, String colour) {
        this.posx = posx;
        this.posy = posy;
        this.colour = colour;
    }

    public abstract void draw();
}
