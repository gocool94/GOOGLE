package Challenges.OOPS_Const_Challenge;

public class VIPCustomer {

    private String Name;

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    private double CreditLimit;

    public VIPCustomer(){
        this("Default",2000.0,"eeeee");
    }

    public VIPCustomer(String name, String emailAddress) {
        Name = name;
        EmailAddress = emailAddress;
    }

    private String EmailAddress;

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        Name = name;
        CreditLimit = creditLimit;
        EmailAddress = emailAddress;
    }
}
