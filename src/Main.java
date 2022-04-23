import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*b) Bank Management System:
 * Create a Bank Management System which has the following components:
 * Person (which saves first, middle and last name, age and a "social security number")
 * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
 * Checking Account (should have a current value, methods for taking and depositing money)
 * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
 *
 * BONUS: Make the Banking System Interactive (No Solution provided!)*/
public class Main {
    public List<person> bankMembers = new ArrayList<>();
    public static void main(String[] args) {
        person newMember;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Leo Banking :)");
        System.out.println("Are you a? ");
        System.out.println("1 ) Bank Member");
        System.out.println("2 ) New Customer");
        System.out.println("please enter the corresponding number: ");

        int memberType = scanner.nextInt();

        if(memberType == 1)
        {
            System.out.println("Please sign in with your name: ");
            String memberName = scanner.nextLine();
        }
        else if (memberType == 2)
        {
            System.out.println("Would you like to register? Yes/No");
            Scanner scanner2 = new Scanner(System.in);
            String yesNo = scanner2.nextLine();

            if(yesNo.equals("Yes")){
                newMember = registerForm.newRegisterForm();
                Bank.addToBankMembersList(newMember);
            }else if(yesNo.equals("No")){
                System.out.println("ok :)");
            }
        }
    }
}