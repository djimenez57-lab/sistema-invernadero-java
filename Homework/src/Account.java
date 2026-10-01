import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMontlyInterestRate(){
        return Math.pow((1+annualInterestRate),1/12.0) - 1;
    }

    public void withDraw(double withDraw){
        balance -= withDraw;
    }

    public void deposit(double cantity){
        balance += cantity;
    }
}
