package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        PalindromeParser parser = new PalindromeParser();

        String palindrome = "A man, a plan, a canal: Panama";
        int numTries = 10000;

        System.out.println("Heating up");
        Thread.sleep(2000);
        // Method 1
        long totalTime1 = 0;
        boolean result1 = false;
        for (int i = 0; i < numTries; i++) {
            long startTime1 = System.nanoTime();
            result1 = parser.isPalindrome(palindrome);
            long endTime1 = System.nanoTime();
            totalTime1 += (endTime1 - startTime1);
        }
        long averageTime1 = totalTime1 / numTries;
        System.out.println("Method 1 Result: " + result1 + ", Average Execution Time: " + averageTime1 + "ns");

        // Method 2
        long totalTime2 = 0;
        boolean result2 = false;
        for (int i = 0; i < numTries; i++) {
            long startTime2 = System.nanoTime();
            result2 = parser.isPalindromeV2(palindrome);
            long endTime2 = System.nanoTime();
            totalTime2 += (endTime2 - startTime2);
        }
        long averageTime2 = totalTime2 / numTries;
        System.out.println("Method 2 Result: " + result2 + ", Average Execution Time: " + averageTime2 + "ns");

        long totalTime3 = 0;
        boolean result3 = false;
        for (int i = 0; i < numTries; i++) {
            long startTime3 = System.nanoTime();
            result3 = parser.isPalindromeV3(palindrome);
            long endTime3 = System.nanoTime();
            totalTime3 += (endTime3 - startTime3);
        }
        long averageTime3 = totalTime3 / numTries;
        System.out.println("Method 2 Result: " + result3 + ", Average Execution Time: " + averageTime3 + "ns");


        String quitCmd = "q:";
        for (String userLine; !(userLine = sc.nextLine()).equals(quitCmd); System.out.printf("Type '%s' to exit\n", quitCmd)) {
            boolean isPalindrome = parser.isPalindrome(userLine);
            System.out.printf("'%s' is %sa palindrome\n",userLine , isPalindrome ? "" : "not ");
            System.out.println(isPalindrome);
        }
    }
}