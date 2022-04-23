import java.util.ArrayList;
import java.util.List;

public class Bank{

    public static boolean userOwnsAccount;
    public static int maximumOverdrawAmount = 1500;

    public Bank(boolean userOwnsAccount){
        this.userOwnsAccount = userOwnsAccount;
    }
    public static Bank newBankAccount = new Bank(false);
    public static checkingAccount newCheckingAccount = new checkingAccount(0f);

    public static List<Bank> bankAccounts = new ArrayList<>();
    public static List<person> bankMembers = new ArrayList<>();
    public static List<checkingAccount> checkingAccounts = new ArrayList<>();
    public static void createNewBankMember(person member)
    {
        bankMembers.add(member);
        bankAccounts.add(newBankAccount);
        System.out.println(bankAccounts.size());
    }
    public static boolean loginSucceeded(String username){
        for(int i =0; i < bankMembers.size(); i++){
            if(bankMembers.get(i).firstName.equals(username)){
                return true;
            }
        }
        return false;
    }
    public static person findUser(String username){
        for(int i =0; i < bankMembers.size(); i++){
            if(bankMembers.get(i).firstName.equals(username)){
                return bankMembers.get(i);
            }
        }
        return null;
    }
    public static int findUserID(String userName){
        for(int i =0; i < bankMembers.size(); i++){
            if(bankMembers.get(i).firstName.equals(userName)){
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }
}
