package Unidad03.Actividadencasa.models;

public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // 🚪 Método adicional
    public void abrirPuerta() {
        System.out.println("El carro abre una de sus " + numeroPuertas + " puertas.");
    }
}
