import java.util.Scanner;
public class loggedIN {
    public static void homepage(person User){
        int userID = Bank.findUserID(User.firstName);
        System.out.println("Welcome back " + User.firstName);
        if(Bank.userOwnsAccount == false){
            System.out.println("You don't have any accounts open.");
            System.out.println("Would you like to open a checking account? You're required to deposit 500$ to open.");
            Scanner scanner = new Scanner(System.in);
            String confirmation = scanner.nextLine();
            if (confirmation.equals("Yes")){
                Bank.bankAccounts.get(userID).userOwnsAccount = true;
                Bank.checkingAccounts.get(userID).balance += 500f;
                loggedIN.homepage(User);
            }else
            {
                loggedIN.homepage(User);
            }
        }else if(Bank.userOwnsAccount){
            System.out.println("Your accounts: ");
            System.out.println("Checking Account: ");
            System.out.println("Balance: " + Bank.checkingAccounts.get(userID).balance);
            System.out.println("Max Overdraft amount: " + Bank.maximumOverdrawAmount);
        }
        System.out.println("Would you like to do any of the following operations? ");
        System.out.println("1) Withdraw");
        System.out.println("2) Deposit");
        System.out.println("please enter the corresponding number: ");
        Scanner scanner3 = new Scanner(System.in);
        int depositWithdrawal = scanner3.nextInt();

        if(depositWithdrawal == 1)
        {
            Bank.checkingAccounts.get(userID).balance -= checkingAccount.withdrawal();
        }
        else if (depositWithdrawal == 2)
        {
            Bank.checkingAccounts.get(userID).balance += checkingAccount.deposit();
        }
        loggedIN.homepage(User);
    }
}
