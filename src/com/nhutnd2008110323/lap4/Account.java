package com.nhutnd2008110323.lap4;
import java.util.Scanner;
public class Account {
    // attribute thuộc tính - data
        int  account_number;
        int account_balance;
    // method phương thức 
        Account(int a, int b) {
            account_balance = b ;
            account_number  = a ;
        }
        void showData(){
            System.out.println("Number Account  "+account_number);
            System.out.println("Account balance "+account_balance);
        }
        void deposit(int ammount){
            account_balance += ammount;

        }
        void withdraw(int amount){
            account_balance -= amount;
        }

}    
