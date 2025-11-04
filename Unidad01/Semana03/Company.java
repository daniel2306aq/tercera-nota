package Unidad01.Semana03;
public class Company {

    public static class NewCompany {
        public String nombre;
        protected String rol;
        private double salario;

        public void setSalario(double salario) {
            if (salario > 0) {
                this.salario = salario;
            } else {
                System.out.println("Salario mayor a 0.0");
            }
        }

        public double getSalario() {
            return salario;
        }

        public void aumentarSalario(double cantidad) {
            if (cantidad > 0) {
                salario += cantidad;
            } else {
                System.out.println("La cantidad para aumentar debe ser positiva.");
            }
        }

        public void mostrarEmpleado() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Rol: " + rol);
            System.out.println("Salario: " + salario);
        }
    }

    public static void main(String[] args) {
        NewCompany empleado1 = new NewCompany();
        empleado1.nombre = "Carlos Pérez";
        empleado1.rol = "Desarrollador";
        empleado1.setSalario(2500.0);

        empleado1.aumentarSalario(500.0);

        System.out.println("Información del empleado:");
        empleado1.mostrarEmpleado();
    }
}
