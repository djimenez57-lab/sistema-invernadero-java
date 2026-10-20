public class Triangulo extends Figura {

    protected int base, altura;
    public Triangulo(int ba, int al){
        base = ba;
        altura = al;
    }

    @Override
    public double getArea() {
        return (base*altura)/2;
    }

    @Override
    public void mostrarNombre(){
        System.out.println("triangulo");
    }
}

