package project_7;

import java.util.Scanner;

public class Main {
    
    static BankAccount bankAccount = new BankAccount();

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) { 

        // variables
        int choice;

        // print the options
        options();

        // take the user choice
        System.out.print("Please choose 1, 2 or 3: ");
        choice = input.nextInt();

        choice(choice);

    }

    static void choice(int choice) {

        if(choice == 1) {

            System.out.printf("\nThe amount is %.6f%n", bankAccount.getAmount());

        }

        else if(choice == 2) {

            System.out.print("Enter the amount to deposit: ");
            bankAccount.setDeposit(input.nextDouble());
            bankAccount.setAmount(bankAccount.getAmount() + bankAccount.getDeposit());

            System.out.printf("%nThe new amount is %.6f%n", bankAccount.getAmount());

        }

        else if(choice == 3) {

            System.out.print("Enter the amount to withdraw: ");
            bankAccount.setWithdraw(input.nextDouble());
            bankAccount.setAmount(bankAccount.getAmount() - bankAccount.getWithdraw());

            System.out.printf("%nThe new amount is %.6f%n", bankAccount.getAmount());

        }

    }

    static void options() {

        System.out.printf("Choose an operation:%n1) Amount%n2) Deposit%n3) Withdraw%n");

    }

}
