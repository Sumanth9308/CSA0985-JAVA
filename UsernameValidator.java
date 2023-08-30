import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        
        if (isValidUsername(username)) {
            System.out.println("The username is valid.");
        } else {
            System.out.println("The username is not valid.");
        }
    }

    public static boolean isValidUsername(String username) {
        return username.length() >= 5;
    }
}