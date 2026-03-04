public class PalindroneCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");


        String text = "madam";


        String reversed = new StringBuilder(text).reverse().toString();

        // Check if palindrome
        if (text.equalsIgnoreCase(reversed)) {
            System.out.println("The string \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a palindrome.");
        }
    }
}
