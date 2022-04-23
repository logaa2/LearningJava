import java.util.Scanner;
public class loggedIN {
    public static void homepage(person User){
        int userID = Bank.findUserID(User.firstName);
        System.out.println("Welcome back " + User.firstName);
        if(Bank.userOwnsAccount == false){
            System.out.println("You don't have any accounts open.");
            System.out.println("Would you like to open a checking account? ");
            Scanner scanner = new Scanner(System.in);
            String confirmation = scanner.nextLine();
            if (confirmation.equals("Yes")){
                Bank.bankAccounts.get(userID).userOwnsAccount = true;
                Bank.checkingAccounts.add(Bank.newCheckingAccount);
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
    }
}
