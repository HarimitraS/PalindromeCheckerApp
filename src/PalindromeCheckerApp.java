public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }

    }

    private static boolean check(String a, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (a.charAt(start) != a.charAt(end)) {
            return false;
        }

        return check(a, start + 1, end - 1);

    }

}