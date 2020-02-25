package punto3;

public class Figura implements Metodos {

    private double area = 0;
    private double radio = 0;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Figura(double area, double radio) {
        this.area = area;
        this.radio = radio;
    }

    public Figura() {

    }

    @Override
    public String toString() {
        return "Figura{" +
                "area=" + area +
                ", radio=" + radio +
                '}';
    }


    @Override
    public void calcularArea(double radio) {
        area = Math.PI*Math.pow(radio,2);
        setArea(area);
    }

    @Override
    public double mostrarDatos() {
        return 0;
    }
}
