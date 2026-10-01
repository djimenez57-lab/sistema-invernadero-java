public class Circle {
    private double radius;

    public  Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return Math.PI*2*radius;
    }

    public double getDiameter(){
        return radius*2;
    }

    public void printCircle(){
        System.out.println(radius+" "+super.toString());
    }
}
