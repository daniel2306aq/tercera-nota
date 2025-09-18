package Semana04.ClaseName;

public class Car {
    String brand;
    int year;

    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
        
    }
    public void ShowInfo (){
        System.out.println("La marca es: " + brand);
          System.out.println("El año es: " + year);
    }
}
