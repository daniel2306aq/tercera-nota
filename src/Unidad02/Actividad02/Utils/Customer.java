package Unidad02.Actividad02.Utils;

import java.util.ArrayList;

public class Customer {
    String name;
    String email;
    ArrayList<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
    }

    public String getInfo() {
        return "Customer: " + name + " (" + email + "), Orders: " + orders.size();
    }
}
