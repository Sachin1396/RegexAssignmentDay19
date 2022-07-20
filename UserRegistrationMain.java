import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args){
        UserInformation userInformation = new UserInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.To Validate the First name.");
        System.out.println("2.To Validate the Last Name.");
        System.out.println("3.TO Validate Email id");
        System.out.println("4.To Validate Mobile Number");
        System.out.println("Enter the option number to perform the operation");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("enter the first name");
                String firsName = scanner.nextLine();
                userInformation.validateFirstname(firsName,"^[A-Z]{1}[A-Za-z]{2}$");
                break;
            case 2:
                System.out.println("Enter the user last name");
                String lastName = scanner.nextLine();
                userInformation.validateFirstname(lastName,"^[A-Z]{1}[A-Za-z]{2}$");
                break;
            case 3:
                System.out.println("enter the user mail id");
                String email = scanner.nextLine();
                userInformation.validateFirstname(email,"[a-zA-z0-9]{2,}[_]@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}");
                break;
            case 4:
                System.out.println("enter the valid phone number0");
                String number = scanner.nextLine();
                userInformation.validateFirstname(number,"^[0-9]{2}\\s?[6-9]{1}[0-9]{9}");
                break;
            default:
                System.out.println("enter valid option");
                break;

        }

    }

}
