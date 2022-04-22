import java.util.Scanner;

public class checkingAccount {
    float balance;
    public float withdrawal(){
        System.out.print("Withdrawal ammount: ");
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();
        return input;
    }
}
