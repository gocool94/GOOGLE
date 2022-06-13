package Challenges.OOPS_Const_Challenge;

public class Account {

    /*
     // Create a new class for a bank account
     // Create fields for the account number, balance, customer name, email and phone number.
       // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
     */

    public void DepositFunds(double DepositMoney){

        this.balance += DepositMoney;

    }


    public void Withdrawal(double WithdrawalMoney){

        if(this.balance < WithdrawalMoney){
            System.out.println("Insufficient Balance");
        }else {
            System.out.println(WithdrawalMoney +"Successfull");

            this.balance -= WithdrawalMoney;

            System.out.println("Current balance is" + this.balance);
        }
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    private int AccountNumber;
    private int balance;
    private String CustomerName;
    private String Email;
    private long PhoneNumber;

    public Account(){
        this(1234,2222,"Default Name","Default Email Address",12334);
        System.out.println("Empty Constructor is being called");

    }

    public Account(int accountNumber, int balance, String customerName, String email, long phoneNumber) {
        AccountNumber = accountNumber;
        this.balance = balance;
        CustomerName = customerName;
        Email = email;
        PhoneNumber = phoneNumber;
    }
}
