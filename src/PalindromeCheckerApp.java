import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("      PALINDROME CHECKER APP      ");
        System.out.println("==================================");

        // Declare and initialize input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare original string with popped characters
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}