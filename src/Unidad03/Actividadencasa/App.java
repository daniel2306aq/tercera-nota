package Unidad03.Actividadencasa;
import Unidad03.Actividadencasa.models.Carro;
import Unidad03.Actividadencasa.models.Moto;

public class App {
    public static void main(String[] args) {
       
        Carro miCarro = new Carro("Toyota", "Corolla", 4);
        miCarro.acelerar(40);
        miCarro.abrirPuerta();
        miCarro.frenar(15);

        System.out.println("--------------------");

        Moto miMoto = new Moto("Yamaha", "FZ", true);
        miMoto.acelerar(60);
        miMoto.hacerWheelie();
        miMoto.frenar(30);
    }
}
