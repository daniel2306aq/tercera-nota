package Unidad03.Actividadencasa.models;

public class Vehiculo {
    // 🔒 Atributos (encapsulados)
    private String marca;
    private String modelo;
    private int velocidad;

    // 🧩 Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0; // velocidad inicial
    }

    // ⚙️ Métodos getters y setters (encapsulación)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // 🚗 Métodos generales
    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("El vehículo acelera a " + velocidad + " km/h.");
    }

    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) velocidad = 0;
        System.out.println("El vehículo frena. Velocidad actual: " + velocidad + " km/h.");
    }
}
