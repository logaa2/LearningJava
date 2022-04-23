import java.util.Scanner;

public class registerForm{
    public static person newRegisterForm(){
        Scanner firstScanner = new Scanner(System.in);
        Scanner secondScanner = new Scanner(System.in);
        Scanner thirdScanner = new Scanner(System.in);
        Scanner fourthScanner = new Scanner(System.in);
        Scanner fifthScanner = new Scanner(System.in);
        System.out.println("Please register your details: )");
        System.out.println("First Name: ");
        String firstName = firstScanner.nextLine();

        System.out.println("Middle Name: ");
        String middleName = secondScanner.nextLine();

        System.out.println("Last Name: ");
        String lastName = thirdScanner.nextLine();

        System.out.println("Age: ");
        int age = fourthScanner.nextInt();

        System.out.println("Social Security Number: ");
        String socialSecurityNumber = fifthScanner.nextLine();

        person newRegister = new person(firstName, middleName, lastName, age, socialSecurityNumber);
        return newRegister;
    }
}
