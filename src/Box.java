public class Box extends Rectangle implements D3Shapes {
    private int depth;

    public Box(int width , int height , int depth){
        super(height , width);
        this.depth = depth;
    }

    @Override
    public int volume() {
        int volume = super.area()*this.depth;
        String message = "the volume of the current Box is: "+volume;
        if(isACube()) message+= "oh your box is a cube :)";
        System.out.println(message);
        //returns a value for further process
        return volume;
    }
    private boolean isACube() {
        return (super.isASquare()) && super.width == this.depth;
    }
}
