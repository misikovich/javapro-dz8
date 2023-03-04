package org.example;


public class PalindromeParser {
    public boolean isPalindrome(String palindrome) {
        String palindromeNormalized = palindrome.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int length = palindromeNormalized.length();
        int halfLength = length / 2;

        String part1 = palindromeNormalized.substring(0, halfLength);
        String part2 = new StringBuilder(palindromeNormalized.substring(halfLength + length % 2)).reverse().toString();

        if (length % 2 == 1) {
            part1 = part1.substring(0, halfLength);
        }

        return part1.equals(part2);

    }
}
