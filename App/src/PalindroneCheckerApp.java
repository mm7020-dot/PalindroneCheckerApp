import java.util.Scanner;

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker App");

        System.out.println("Enter a String: ");
        String text = sc.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        if(text.equalsIgnoreCase(reversed)){
            System.out.println("The string is " + text + " a palindrome.");
        }
        else{
            System.out.println("The string is " + text + " NOT a plaindrome.");
        }
    }
}
