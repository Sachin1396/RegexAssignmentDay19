import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args){
        UserInformation userInformation = new UserInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first name");
        String firsName = scanner.nextLine();
        userInformation.validateFirstname(firsName,"^[A-Z]{1}[A-Za-z]{2}$");

    }

}
