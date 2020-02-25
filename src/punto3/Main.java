package punto3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Figura figura = new Figura();

        System.out.println("Ingrese el valor del radio: ");
        figura.setRadio(scanner.nextDouble());
        figura.calcularArea(figura.getRadio());


        System.out.println("El Area Del Circulo Es: " + figura.getArea());
    }
}
