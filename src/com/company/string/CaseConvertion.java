package com.company.string;
import java.util.Scanner;
public class CaseConvertion {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=scan.nextLine();
        char[] arr=new char[input.length()];
        int k=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)>='a'&&input.charAt(i)<='z')
            {
                arr[k++]=Character.toUpperCase(input.charAt(i));
            }else {
                arr[k++] = Character.toLowerCase(input.charAt(i));
            }
        }
        String output=String.copyValueOf(arr);
        System.out.println(output);
    }
    }



