package punto4;

import java.util.Scanner;

public class Producto implements Metodos4{
    private float valor = 0;
    private double total = 0;
    private final double IVA = 0.21;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public void valorProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        setValor(scanner.nextFloat());
        setTotal((IVA * getValor()) + valor);

        System.out.println("valor total: " + getTotal());
    }
}
