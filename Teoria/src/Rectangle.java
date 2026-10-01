public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super();
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return height*width;
    }

    public double getPerimeter(){
        return (2*height)*(2*width);
    }

    public void printRectangle(){
        System.out.println(height+" "+width+" "+super.toString());

    }
}
