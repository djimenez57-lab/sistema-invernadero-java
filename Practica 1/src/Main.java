import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> conceptos = new ArrayList<>();
        String[] categorias=new String[5];

        categorias[0] = "Alimentos";
        conceptos.add("Garnacha");
        conceptos.add("Parangaricutirimicuaro");
        System.out.println(categorias[0]);
        System.out.println(conceptos.get(0));
        System.out.println(conceptos.get(1));

        System.out.println(conceptos.size());

        conceptos.addFirst("Chocolate");
        conceptos.add(2, "Pan");

        for(String item:conceptos){
            System.out.println(item);
        }

        if(conceptos.contains("Chocolate")){
            System.out.println("Encontré Chocolate en tu lista! ");
            System.out.println("Mejora tu dieta");
        }

    }
}