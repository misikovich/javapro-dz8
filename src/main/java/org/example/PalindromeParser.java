package org.example;


import org.jetbrains.annotations.NotNull;

import java.util.Objects;

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
        //Average Execution Time: 19884ns
    }

    public boolean isPalindromeV2(@NotNull String palindrome) {
        if (palindrome.length() == 0) return true;
        char[] palChars = palindrome.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();

        for (int i = 0; i < palChars.length; i++) {
            if (!Objects.equals(palChars[i], palChars[palChars.length - i - 1])) return false;
        }

        return true;
        //Average Execution Time: 4677ns
    }

    public boolean isPalindromeV3(@NotNull String palindrome) {
        char[] clean = palindrome.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        for (int i = 0; i < clean.length / 2; i++) {
            if (clean[i] != clean[clean.length - i - 1]) {
                return false;
            }
        }
        return true;
        //Average Execution Time: 4047ns
    }

}
