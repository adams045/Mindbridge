import java.util.*;
public class bankAccount{
    Scanner sc= new Scanner(System.in);
    private long accountNumber;
    private double balance;
    private long amount = 0;
    private long withdraw_amount =0;

    
    public bankAccount(long accountNumber , double balance){
        this.accountNumber=accountNumber;
        this.balance= balance;
    }
    public void deposit(){
        System.out.println("Enter amount to deposit");
        amount=sc.nextLong();
        amount+=balance;
    }
    public void withdraw(){
        System.out.println("Enter amount to Withdraw");
        withdraw_amount=sc.nextLong();
        if(amount<withdraw_amount){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Cash has been Withdrawed");
            amount-=withdraw_amount;
        }
    }
    public void balance(){
        System.out.println("Balance :" + amount);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        long accountNumber=sc.nextLong();
        System.out.println("Enter the Balance");
        double balance = sc.nextLong();
        boolean isTrue = true;
        bankAccount obj = new bankAccount(accountNumber, balance);
        while(isTrue){
            System.out.println("Enter the Choice");
            System.out.println("1-> Deposit------ 2-> Withdrawl-------- 3-> Check Balance------ 4-> Exit");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                        obj.deposit();
                        break;
                case 2:
                        obj.withdraw();
                        break;
                case 3:
                        obj.balance();
                        break;
                case 4:
                        isTrue=false;
                        break;
            }
        }
    }
}