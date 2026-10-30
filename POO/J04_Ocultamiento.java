package POO;
import java.util.Scanner;
//EJEMPLO USADO J03 Y J04
public class J04_Ocultamiento {
    public static class BankAccount{
        public final String accountNumber;
        private double balance=0.0;
        private String ownerName;

        public BankAccount(String accountNumber, String ownerName){
            this.accountNumber=accountNumber;
            this.ownerName=ownerName;
        }
        
        public double getBalance(){return this.balance; }
        public String getOwner(){return this.ownerName;}
        public String getAccountNumber(){return this.accountNumber;}

        public boolean deposit(double amount){
            if(amount>0){
                this.balance+=amount;
                return true;
            }
            else{
                return false;
            }
        }
        public boolean withdraw(double amount){
            if(amount>0 && amount<=this.balance){
                this.balance-=amount;
                return true;
            }
            else{
                return false;
            }
        }
        public void getAccountSummary(){
            System.out.println("Account "+getAccountNumber()+" | Owner: "+getOwner()+" | Balance: $"+ getBalance());
        }
    }
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Owner: ");
        String ownerName=scanner.nextLine();
        System.out.print("Account: ");
        String accountNumber=scanner.nextLine();
        System.out.print("Deposit amount: ");
        double depositAmount1=scanner.nextDouble();
        System.out.print("Withdraw amount: ");
        double withdrawAmount=scanner.nextDouble();

        BankAccount obj=new BankAccount(accountNumber, ownerName);

        boolean depositResult=obj.deposit(depositAmount1);
        boolean withdrawResult=obj.withdraw(withdrawAmount);

        System.out.printf("\n%-12s %12s%n", "Account:", obj.getAccountNumber());
        System.out.printf("%-12s %12s%n", "Owner:", obj.getOwner());
        System.out.printf("%-12s %12b%n", "Deposit?:", depositResult);
        System.out.printf("%-12s %12b%n", "Withdraw?:", withdrawResult);
        System.out.printf("%-12s %12.2f%n", "Balance:", obj.getBalance());
        obj.getAccountSummary();
    }
}
