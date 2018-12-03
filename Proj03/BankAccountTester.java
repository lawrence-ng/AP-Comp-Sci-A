
/**
 * Write a description of class BankAccountTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountTester
{
    
    public BankAccountTester()
    {
    
    }
    
    public static void main(String[] args)
    {
        BankAcct account = new BankAcct("Harry", 200);
        System.out.println(account.getBalance() + "\nexpected: 200");
        account.deposit(50);
        System.out.println(account.getBalance() + "\nexpected: 250");
        account.withdraw(100);
        System.out.println(account.getBalance() + "\nexpected: 150");
        account.deposit(300);
        System.out.println(account.getBalance() + "\nexpected: 450");
        account.withdraw(500);
        System.out.println(account.getBalance() + "\nexpected: -50");
        account.deposit(250);
        System.out.println(account.getBalance() + "\nexpected: 200");
        account.addInterest(.05);
        System.out.println(account.getBalance() + "\nexpected: 210");
    }
}
