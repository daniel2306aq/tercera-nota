package Unidad03.Actividadencasa.models;

public class Moto extends Vehiculo {
    private boolean tieneParrilla;

    public Moto(String marca, String modelo, boolean tieneParrilla) {
        super(marca, modelo);
        this.tieneParrilla = tieneParrilla;
    }

    public boolean isTieneParrilla() {
        return tieneParrilla;
    }

    public void setTieneParrilla(boolean tieneParrilla) {
        this.tieneParrilla = tieneParrilla;
    }

    // 🌀 Método adicional
    public void hacerWheelie() {
        System.out.println("La moto hace un wheelie espectacular! 🏍️💨");
    }
}

