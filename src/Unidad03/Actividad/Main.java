package Unidad03.Actividad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Cien años de soledad", "Gabriel García Márquez", 59.99));
        books.add(new Book("El principito", "Antoine de Saint-Exupéry", 35.50));
        books.add(new Book("Don Quijote de la Mancha", "Miguel de Cervantes", 72.00));

        BookFileHandler handler = new BookFileHandler();

        handler.saveBooks(books);

        handler.readBooks();
    }
}
