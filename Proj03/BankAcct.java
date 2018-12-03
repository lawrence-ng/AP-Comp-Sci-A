
/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 * @version v. 1.0
 */
public class BankAcct
{
    //FIELDS
    private String name;
    private double balance;
    
    /**
     * Constructs a bank account with an empty name and a balance of 0.0
     */
    
    //CONSTRUCTORS
    public BankAcct()
    {
        name = "";
        balance = 0.0;
    }
    
    /**
     * Constructs a bank account with a given balance.
     * @param name the name of the account owner
     * @param initialBalance the initial balance
     */
    
    public BankAcct(double initBal)
    {
        balance = initBal;
    }
    
    public BankAcct(String name)
    {
        name = name;
        balance = 0.0;
    }
    
    public BankAcct(String name, double initBal)
    {
        name = name;
        balance = initBal;
    }
    
    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    
    //METHODS
    public double getBalance()
    {
        return balance;
    }
    
    public void deposit(double amt)
    {
        balance += amt;
    }
    
    public void withdraw(double amt)
    {
        balance -= amt;
    }
    
    public void addInterest(double rate)
    {
        balance += balance * rate;
    }
}
