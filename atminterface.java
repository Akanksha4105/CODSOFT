import java.util.Scanner;
class Bankacc {
    private double balance;
    public Bankacc(double inibalace){
        this.balance = inibalace;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if (amount >0) {
            balance+=amount;
            System.out.println("SUCCESSFULLY deposited:" + amount);
        }
        else{
            System.out.println("Deposit amount must be POSITIVE");
        }
    }
    public void withdraw(double amount){
        if (amount>0 && amount <= balance){
            balance -= amount;
            System.out.println("Sucessfully withdrawn: " + amount);
        }
        else if(amount> balance){
            System.out.println("INSUFFICIENT BALANCE");
        }
        else{
            System.out.println("Withdrawl amount must be POSITIVE");
        }
    } 
}
class ATM {
    private Bankacc account;
    public ATM(Bankacc account){
        this.account = account;
    }
    public void checkBal(){
        System.out.println("Current balance: " + account.getBalance());
    }
    public void deposit(double amount){
        account.deposit(amount);
    }
    public void withdraw(double amount){
        account.withdraw(amount);
    }
}
public class atminterface{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Bankacc useracc = new Bankacc(1000.0);
        ATM atm= new ATM (useracc);
        int choice;
        do{
            System.out.println("\n=====Atm menu=====");
            System.out.println("1. Check balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                atm.checkBal();
                break;
                case 2:
                System.out.println("Enter deposit amount:");
                double depoamn= sc.nextDouble();
                atm.deposit(depoamn);
                break;
                case 3:
                System.out.println("Enter withdrawl amount:");
                double withamn= sc.nextDouble();
                atm.withdraw(withamn);
                break;
                case 4:
                System.out.println("THANK YOU for using the atm");
                break;
                default:
                System.out.println("INVALID CHOICE Try again");
            }
        }while (choice !=4);
        sc.close();  
    }
}