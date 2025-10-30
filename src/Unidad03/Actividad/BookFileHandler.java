package Unidad03.Actividad;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookFileHandler {

    private static final String FILE_NAME = "libros.txt";

    public void saveBooks(List<Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book book : books) {
                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getPrice());
                writer.newLine();
            }
            System.out.println("✅ Libros guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar los libros: " + e.getMessage());
        } finally {
            System.out.println("Operación finalizada (guardar).");
        }
    }

    public List<Book> readBooks() {
        List<Book> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String title = data[0];
                    String author = data[1];
                    double price = Double.parseDouble(data[2]);
                    books.add(new Book(title, author, price));
                }
            }
            System.out.println("📚 Libros leídos desde el archivo:");
            for (Book b : books) {
                System.out.println(b);
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer los libros: " + e.getMessage());
        } finally {
            System.out.println("Operación finalizada (lectura).");
        }
        return books;
    }
}

