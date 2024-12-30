package Additional;
import java.util.*;
public class bankAccount{
    Scanner sc= new Scanner(System.in);
    private String name;
    private String address;
    private long phoneNumber;
    private long accountNumber;
    private double balance;
    private long amount = 0;
    private long withdraw_amount =0;

    public bankAccount(){
        accountNumber=0;
    }
    
    public bankAccount(long accountNumber , double balance){
        this.accountNumber=accountNumber;
        this.balance= balance;
    }
    public void openAccount(){
        System.out.println("Enter the Name");
        name=sc.nextLine();
        System.out.println("Enter Your Address");
        address=sc.nextLine();
        System.out.println("Enter Your Phone Number");
        phoneNumber=sc.nextLong();
        System.out.println("Your Account has been Created");
        accountNumber=(long)(Math.floor(Math.random()*1000000000));
        System.out.println("Your Account Number is:"+ accountNumber);
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

    public void show(){
        System.out.println( "Name: "+ name);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Address: "+ address);
        System.out.println("Phone Number: "+ phoneNumber);
        System.out.println("Balance: "+ amount);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        bankAccount obj = new bankAccount();
        while(isTrue){
            System.out.println("Enter the Choice");
            System.out.println(" 1->Crete Account-------- 2-> Deposit------ 3-> Withdrawl-------- 4-> Check Balance------ 5-> Show Account Details----- 6->Exit");
            int choice = sc.nextInt();

            switch(choice){

                case 1:
                        obj.openAccount();
                        break;

                case 2:
                        obj.deposit();
                        break;
                case 3:
                        obj.withdraw();
                        break;
                case 4:
                        obj.balance();
                        break;

                case 5:
                        obj.show();
                        break;

                case 6:
                        isTrue=false;
                        break;
            }
        }
    }
}
