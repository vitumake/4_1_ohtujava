import java.util.Scanner;

import java.util.Scanner;

public class PalindromeChecker {
    
    public static String transformInput(String input) {
        return input.toLowerCase().replaceAll("[,!]", "");
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