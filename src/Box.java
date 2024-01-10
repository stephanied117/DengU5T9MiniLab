public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // creates a cube: a box with all dimensions equal to side
    public Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return length * width * height;
    }

    public Box greaterVolume(Box otherBox) {
        if (otherBox.volume() > volume()) {
            return otherBox;
        } else if (otherBox.volume() < volume()) {
            return this;
        } else {
            return null;
        }
    }

    public String boxInfo() {
        return InfoString.boxInfoString(this);
    }

    public void addToShape(Shape s) {
        s.attachBox(this);
    }
}
