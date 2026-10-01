import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String nombre;
        float[] cal = new float[3];
        float prom = 0, suma = 0;
        Scanner input;

        System.out.println("Ingresa el nombre del estudiante: ");
        input = new Scanner(System.in);
        nombre = input.next();

        for(int i=0; i<3;i++){
            System.out.println("Introduzca una calificación: ");
            cal[i] = input.nextFloat();
        }
        for(int i=0; i<3;i++){
            suma += cal[i];
        }

        prom = (float) (suma/3.0);
        System.out.println("Nombre: "+nombre);
        System.out.println("Promedio: "+prom);

        if (prom > 6.0){
            System.out.println("El promedio es mayor a 6.0");
        }
        else {
            System.out.println("El promedio es menor a 6.0");
        }


    }
}
