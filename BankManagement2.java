import java.util.*;
class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    boolean deposit(double amount){
        if(amount>0){
            balance+=amount;
            return true;
        }
        else{
            System.out.println("Error: Invalid deposit amount");
            return false;
        }
    }
    boolean withdraw(double amount){
        if(amount<=0){
            System.out.println("Error: Invalid withdrawal amount");
            return false;
        }
        if(amount>balance){
            System.out.println("Error: Insufficient balance");
            return false;
        }
        balance-=amount;
        System.out.println("Withdrawal Successful");
        return true;
    }
    double getBalance(){
        return balance;
    }
}
public class BankManagement2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount(0.0);
        double initialBalance = b1.getBalance();
        double totalDeposited = 0;
        double totalWithdrawn = 0;
        int choice = 0;
        while(choice!=5){
            System.out.println("""
                ====================================
                Welcome to Your Bank Account
                \t1. Deposit
                \t2. Withdraw
                \t3. Bank Statement
                \t4. Continue
                \t5. Exit
                ====================================
            """);
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if(choice==1){
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                if(b1.deposit(amount)){
                    totalDeposited += amount;
                }
            }
            else if(choice==2){
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                if (b1.withdraw(amount)) {
                    totalWithdrawn += amount;
                }
            }
            else if(choice==3){
                System.out.println("Initial Balance: " + initialBalance);
                System.out.println("Total Deposited: " + totalDeposited);
                System.out.println("Total Withdrawn: " + totalWithdrawn);
                System.out.println("Final Balance: " + b1.getBalance());
            }
            else if(choice==4){
                continue;
            }
            else if(choice==5){
                System.out.println("Exiting... Thank you!");
            }
            else{
                System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}
