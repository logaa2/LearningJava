import java.util.Scanner;
public class checkingAccount{
    float balance;
    public checkingAccount(float balance)
    {
        this.balance = balance;
    }
    public static float withdrawal() {
        System.out.print("Withdrawal amount: ");
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();
        if(input > 1500){
            System.out.print("The max withdrawal amount is: " + Bank.maximumOverdrawAmount);
            return 0;
        }
        return input;
    }
    public static float deposit() {
        System.out.print("Deposit amount: ");
        Scanner scanner2 = new Scanner(System.in);
        return scanner2.nextFloat();
    }
}
