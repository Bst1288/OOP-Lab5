import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    Account(){

    }

    Account(int newID,double newBalance){
        this.id = newID;
        this.balance = newBalance;
        this.dateCreated = new Date();
    }

    //Mutator methods
    public void setId(int newID){
        this.id = newID;
    }

    public void setBalance(int newBalance){
        this.balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

    // Accessor methods
    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    //returns the monthlyinterest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    //returns the monthlyinterest
    public double getMonthlyInterest(){
        return balance*(getMonthlyInterestRate()/100);
    }

    //Increase
    public void deposit(double money){
        this.balance = balance + money;
    }
    
    //Decrease
    public void withdraw(double money){
        this.balance = balance - money;
    }

    public String getDateCreated(){
        return dateCreated.toString();
    }
}
