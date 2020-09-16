public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        double volume = getArea() *height;
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                ", height=" + height +
                ", volume=" + getVolume()+ '\'' +
                '}';
    }
}
