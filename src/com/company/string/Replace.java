package com.company.string;
import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scan.nextLine();
        System.out.println("Enter the string to replace:");
        String replaceable = scan.next();
        System.out.println("Enter the string for replacing");
        String replace = scan.next();
        String replacedStr = "";
        String[] str = input.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(replaceable)) {
                str[i] = replace;

            }
            replacedStr += " " + str[i];
        }
        System.out.println(replacedStr);
    }
}
