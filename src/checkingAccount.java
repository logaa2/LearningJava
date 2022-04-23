import java.util.Scanner;
public class checkingAccount{
    float balance;
    public checkingAccount(float balance)
    {
        this.balance = balance;
    }
    public float withdrawal() {
        System.out.print("Withdrawal amount: ");
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();
        return input;
    }
    public float deposit() {
        System.out.print("Deposit amount: ");
        Scanner scanner2 = new Scanner(System.in);
        float input = scanner2.nextFloat();
        return input;
    }
}
