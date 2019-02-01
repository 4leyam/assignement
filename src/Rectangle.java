public class Rectangle implements D2Shapes {
    protected int height;
    protected int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int area() {
        int area = this.height * this.width;
        String message = "the area of the current shape is: "+area;
        if(isASquare()) message+=" Oh it's a square :) ";
        System.out.println(message);
        return area;
    }

    protected boolean isASquare() {
        return width == height;
    }
}
