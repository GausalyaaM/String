package com.company.string;
import java.util.Scanner;

public class PalindromicSubstr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scan.nextLine();
        int j = input.length() - 1, i = 0, k = 0;
        char arr[] = new char[20];
        String newStr = "";
        while (i < j) {
            if (input.charAt(i) == input.charAt(j)) {
                while (i < j && input.charAt(i + 1) == input.charAt(j - 1)) {
                    arr[k++] = input.charAt(i);
                    i++;
                    j--;
                }
                i++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        newStr=String.copyValueOf(arr,0,k);
        System.out.println(newStr);
    }
}

