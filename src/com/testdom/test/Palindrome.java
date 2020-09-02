package com.testdom.test;

/**
 * Created by dineshs on 6/5/2019.
 */

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int wordLength = word.length();
        boolean isPalindromeWrd = true;

        for (int i=0,j=wordLength -1; i < j; i++, j--) {
            if(Character.toUpperCase(word.charAt(i)) != Character.toUpperCase(word.charAt(j))) {
                isPalindromeWrd = false;
            }
        }

        return isPalindromeWrd;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deletveled"));
    }
}
