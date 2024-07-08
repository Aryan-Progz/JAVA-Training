import java.util.Scanner;

class BankAccount {
    protected String accnum;
    protected double bal;

    public void inputData(String accnum, double bal) {
        this.accnum = accnum;
        this.bal = bal;
    }

    public void display() {
        System.out.println("Account Number: " + accnum);
        System.out.println("Balance: " + bal);
    }

    public void deposit(double amt) {
        bal =bal+ amt;
        System.out.println("Deposit of " + amt);
    }

    public void withdraw(double amt) {
        if ( amt <= bal) {
            bal =bal- amt;
            System.out.println("Withdrawal of " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
class SavingsAccount extends BankAccount {
    
    public void withdraw(double amt) {
        if (bal- amt >= 1000) {
            bal -= amt;
            System.out.println("Withdrawal of " + amt );
        } else {
            System.out.println("Insufficient balance. Minimum balance of 1000 required.");
        }
    }
}
public class Bankacc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SavingsAccount sa=new SavingsAccount();
        System.out.println("Enter Account Number:");
        String accnum=sc.next();
        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        sa.inputData(accountNumber, balance);

        int choice;
        do {
            System.out.println("\n1. Display Account Info");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sa.display();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    sa.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    sa.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
