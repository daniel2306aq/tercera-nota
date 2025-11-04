package Unidad01.Semana04.PasoReferencia;

public class Main {
    public void ChangeBox(Box newBox) {
        newBox.Size = 20;
    }

    public static void main(String[] args) {
        Box box = new Box(50);
        System.out.println(box.Size);  

        Main mainObj = new Main();     
        mainObj.ChangeBox(box);        

        System.out.println(box.Size); 
    }
}
