package punto1;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int variable1 = 0;
        int varibale2 = 0;
        int mayor = 0;

        System.out.println("VARIABLE1: ");
        variable1 = teclado.nextInt();
        System.out.println("VARIABLE2: ");
        varibale2 = teclado.nextInt();

        if (variable1 != varibale2) {
            if (variable1 > varibale2) {
                mayor = variable1;
            } else {
                mayor = varibale2;
            }
            System.out.println("La variable mayor es: " + mayor);
        } else {
            System.out.println("Las variables son iguales");
        }
    }
}
