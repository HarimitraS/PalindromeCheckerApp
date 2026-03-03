public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        PalindromeStrategy strategy = new SimplePalindromeStrategy();

        boolean result = strategy.isPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }

    }

}

interface PalindromeStrategy {

    boolean isPalindrome(String input);

}

class SimplePalindromeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;

        }

        return true;

    }

}