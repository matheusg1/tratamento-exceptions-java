package app;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter account data");
            System.out.print("\nNumber: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            String holder = sc.next();
            sc.next();

            System.out.print("Initial balance: ");
            Double initial = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, initial, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();

            acc.withdraw(amount);
            System.out.print("New balance: " + String.format("%.2f",acc.getBalance()));
        }
        catch(DomainException e){
            System.out.print("ERROR, " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.print("Unexpected error");
        }
        finally{
            System.out.print("\nEnd of program");
        }
        sc.close();
    }
}