
package Unidad01;
public class Sema01 {

    public static class BankAccount {
        String accountNumber;
        String owner;
        double balance;

        void deposit( double amount ){
            balance += amount;
            System.out.println("deposito: " + amount + " | nuevo balance: "+ balance);
        }
        void withdraw (double amount){
            if (balance >= amount) {
                balance -= amount;
                System.out.println("retiro: "+ amount + "ahora el balance es: "+ balance);             
            } else {
                System.out.println("no tiene fondos suficientes");
            }
        }
        void showBalance() {
            System.out.println(" su balance es: "+ balance);
        }
    }

    public static void main(String[] args) {
       BankAccount account1 = new BankAccount();
       account1.accountNumber = "333-333-333";
       account1.balance = 2000000;
       account1.owner = "daniel";
       account1.deposit(500000);
       System.out.println(account1.owner);

       System.out.println("bienvenido " + account1.owner) ;
       System.out.println("su numero de cuenta es " + account1.accountNumber);
       System.out.println("su balance es " + account1.balance);
    
    }
}