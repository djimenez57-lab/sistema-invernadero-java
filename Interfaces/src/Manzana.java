public class Manzana extends Fruta implements eatable{
    private String tipo;

    public Manzana(String tipo, String nombre, String origen){
        super(nombre, origen);
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void howToEat() {
        System.out.println("Lavar, pelar y comer");
    }
}
