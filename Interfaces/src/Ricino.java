public class Ricino extends Fruta implements eatable {
    private String madurez;

    public Ricino(String madurez, String nombre, String origen){
        super(nombre, origen);
        this.madurez = madurez;
    }

    public String getMadurez() {
        return madurez;
    }

    public void setMadurez(String madurez) {
        this.madurez = madurez;
    }

    @Override
    public void howToEat() {
        System.out.println("Lavar, partir en cuadritos y agregar a la embalsamadora.");
    }
}
