public class Circle implements D2Shapes {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        double area = 2*Math.PI * this.radius;
        System.out.println("the area of the current circle is : "+area);
        return (int)Math.ceil(area);
    }
}
