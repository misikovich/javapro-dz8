package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeParser parser = new PalindromeParser();


        String quitCmd = "q:";
        for (String userLine; !(userLine = sc.nextLine()).equals(quitCmd); System.out.printf("Type '%s' to exit\n", quitCmd)) {
            boolean isPalindrome = parser.isPalindrome(userLine);
            System.out.printf("'%s' is %sa palindrome\n",userLine , isPalindrome ? "" : "not ");
            System.out.println(isPalindrome);
        }
    }
}