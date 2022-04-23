import java.util.Scanner;

public class registerForm{
    public static person newRegisterForm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please register your details: )");
        System.out.println("First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Age: ");
        int age = scanner.nextInt();

        System.out.println("Social Security Number: ");
        String socialSecurityNumber = scanner.nextLine();

        person newRegister = new person(firstName, middleName, lastName, age, socialSecurityNumber);
        return newRegister;
    }
}
