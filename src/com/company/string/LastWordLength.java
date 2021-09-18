package com.company.string;
import java.util.Scanner;
public class LastWordLength {
    public static int findLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        String newS = arr[arr.length - 1];
        return newS.length();
    }

    public static void main(String[] args) {
        int len=findLength();
        System.out.println(len);

    }
}
