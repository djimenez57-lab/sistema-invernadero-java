public class Main {
    public static void main() {
        int[] arrayNumber = new int[10];
        Account[] arrayClients = new Account[10];

        for (int i = 0; i < arrayClients.length; i++) {
            arrayClients[i] = new Account(i, 100+i);
        }

        printClients(arrayClients);

        /*
        Account cuentaARM = new Account(1122,20000, 4.5);
        cuentaARM.withDraw(2500);
        cuentaARM.deposit(3000);
        System.out.println("El balance de tu cuenta es: "+cuentaARM.getBalance());
        System.out.println("El interes anual de tu cuenta es: "+cuentaARM.getMontlyInterestRate());
        System.out.println("La fecha de creación de tu cuenta es: "+cuentaARM.getDateCreated());
        */

        }

    public static void printClients(Account [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].getId()+" "+array[i].getBalance());
        }
    }
}
