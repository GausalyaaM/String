package com.company.string;
import java.util.Scanner;

public class LastNonRepeat{
    static final int MAX = 256;
    static String lastNonRepeating(String str,int n){int freq[]=new int[MAX];
     for (int i = 0; i < n; i++)
            freq[str.charAt(i)]++;
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (freq[ch] == 1){
                String output=""; output=output+ch;return output;
        }}
        return "-1";
    }
      public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
String input=sc.nextLine();
int n=input.length();
System.out.println(lastNonRepeating(input,n));

}
}