package com.company.string;
import java.util.Scanner;

public class SwapCornerWords {
    static void swap(String m, int length)
    {
        String first = "";
        String last = "";
        int index = 0;
        for (index = 0; index < length; ++index){
            if (m.charAt(index) == 32) {
                break;
            }
            last += m.charAt(index);
        }
        int index1 = 0;
        for (index1 = length - 1; index1 >= 0; --index1) {
            if (m.charAt(index1) == 32) {
                break;
            }
            first = m.charAt(index1) + first;
        }
        String middle = "";
        for (int i = index1 - 1; i > index; --i) {
            if (m.charAt(i) == 32) {
                middle += " ";
            }
            else {middle += m.charAt(i);
            }
        }
        System.out.print(first + " " + middle + " " + last);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:"); String input=sc.nextLine();
        int length = input.length();
        swap(input,length);
    }
}