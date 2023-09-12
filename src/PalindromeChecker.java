import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) { //main function XD
        
        Scanner scanner = new Scanner(System.in); //scanneri XD
        String input = scanner.nextLine();
        
        String transformed = transformInput(input);
        
        boolean isPalindrome = checkPalindrome(transformed);
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }



    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        if (input.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}