public class Fruta {
    private String name;
    private String origen;

    public Fruta(String nombre, String procedencia){
        name = nombre;
        origen = procedencia;
    }

    public String getOrigen(){
        return origen;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
