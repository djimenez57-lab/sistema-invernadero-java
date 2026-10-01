import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        this.color = "black";
        filled = true;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

//Super() -> Palabra reservada para hacer referencia al padre directo de una clase