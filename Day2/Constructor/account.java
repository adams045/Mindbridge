package Constructor;
import java.util.*;
public class account{
    private long accountNumber;
    private double balance;

    account(){
        accountNumber=25673456;
        balance = 15000;
    }
    account(long accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public static void main(String[] args) {
        account obj =new account();
        account obj1 = new account(73772122, 15000);
    }
}