package ATMDesign;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {



    }
}

class ATM {
/*
    String atmId;
    Address address;
    CardReader cardReader;
    CashDispenser cashdispenser;
    ATMState  atmState;
    CashReader cashReader;            //take the cash and count it
    Printer printer;
    Keypad keypad;                 // take input
    Screen screen;                // view message
    boolean authenticate(Card card);
    boolean executeTransaction(Customer customer, Transaction transaction);
*/
}

class CardReader {
    // void fetch Card Info , which
    Card getCardDetails() {};
}

class CashDispenser {
    Map<CashType, List<Cash>> cashAvailable;
    public void dispenseCash(int amount);
}
public enum CashType {
    FIVE, TWENTY;
}
class Cash {
    String SerialNumber;
}

class Card {
/*  String cardNumber;
    String customerName;
    Date expiryDate;
    int pin;
    float withdrawLimit;
    */
}

class Customer {
/*  String name;
    String email;
    String phone;
    Card card;
    Account account;
    CustomerStatus customerStatus;   // INACTIVE,ACTIVE
*/
}

class Account {
/*   int accountNumber;
    double accountBalance;*/
}

class Transaction {
    /*
    int transactionId;
    Date transactionDate;
    int sourceAccount;
    TransactionStatus transactionStatus;
    TransactionType transactionType;
    */
}

public abstract class ATMState {

    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount){
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashDesposit() {

        //cashReader Read karega then perform  transaction
    }
    public void displayBalance(ATM atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("OOPS!! Something went wrong");
    }
}

