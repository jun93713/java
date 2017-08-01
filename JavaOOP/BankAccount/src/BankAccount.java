import java.util.Arrays;
import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private long checkingBalance;
    private long savingBalance;
    private static int numberOfAccounts = 0;
    private long totalBalance = checkingBalance + savingBalance;

    protected BankAccount(){
        accountNumber = generateAccountNumber();
        numberOfAccounts ++;
    }

    private String generateAccountNumber(){
        String acc = "";
        Random random = new Random();
        for (int i = 0; i < 10; i ++){
            Integer number = random.nextInt(9);
            acc += number.toString();
        }
        return acc;
    }

    public long getCheckingBalance(){
        return checkingBalance;
    }

    public long getSavingBalance() {
        return savingBalance;
    }

    public void deposit(long amount, String acc){
        if (acc.equals("checking")){
            checkingBalance += amount;
        }
        else if (acc.equals("saving")){
            savingBalance += amount;
        }
        else {
            System.out.println("wrong account type!");
        }
        totalBalance = checkingBalance + savingBalance;
    }

    public void withdraw(long amount, String acc){
        if (acc.equals("checking")){
            if (checkingBalance > amount){
                checkingBalance -= amount;
            }
            else {
                System.out.println("not enought money in this account");
            }
        }
        else if (acc.equals("saving")){
            if (savingBalance > amount){
                savingBalance -= amount;
            }
            else {
                System.out.println("not enought money in this account");
            }
        }
        else {
            System.out.println("wrong account type!");
        }
        totalBalance = checkingBalance + savingBalance;
    }

    public void showTotal(){
        System.out.println("the total balance is " + totalBalance);
    }
}
