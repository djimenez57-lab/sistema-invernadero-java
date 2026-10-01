public class Main {
    public static void main(String[]  args){
        Clock relojAdriana = new Clock(9,03,30);
        Clock relojAaron = new Clock();

        relojAdriana.printTime();
        relojAaron.printTime();

        /*relojAdriana.makeCopy(relojAaron);

        relojAdriana.printTime();
        relojAaron.printTime();

        Clock copy = relojAdriana.getCopy();
        copy.printTime();*/

        relojAaron = relojAdriana; //No se copia el contenido, sino la dirección de memoria
        //Si quisiéramos copiar solo el contenido, usamos getCopy()
        relojAdriana.setTime(10,49,20);

        relojAaron.printTime();
        relojAdriana.printTime();
    }
}
