import java.lang.classfile.Signature;

public class Gallina extends Animal implements eatable {

    @Override
    public void comoSuena() {
        System.out.println("Una gallina hace cló cló cló.");
    }

    @Override
    public void howToEat() {
        System.out.println("Se puede comer en caldo, asado, empanizado, etc.");
    }
}
