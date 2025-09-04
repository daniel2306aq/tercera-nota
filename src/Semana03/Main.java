package Semana03;

public class Main {
    public static void main(String[] args) {
        Company.NewCompany empleado1 = new Company.NewCompany();
        empleado1.nombre = "Daniel Ascanio";
        empleado1.rol = "Analista de Datos";
        empleado1.setSalario(1200000.0);

        empleado1.aumentarSalario(500000.0);

        System.out.println("Información del empleado desde Main.java:");
        empleado1.mostrarEmpleado();
    }
}
