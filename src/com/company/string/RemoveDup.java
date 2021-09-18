package com.company.string;
import java.util.Scanner;
public class RemoveDup {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = sc.nextLine();
            char [] arr=str.toCharArray();
            for(int i=1;i<str.length();i++){
                for(int j=0;j<str.length()-i;j++){
                    if(arr[j]>arr[j+1]){
                        char temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            System.out.println(arr);
            int k=0;
            for(int i=0;i<str.length()-1;i++){
                if(arr[i]!=arr[i+1]){
                    arr[k++]=arr[i];
                }
            }
            arr[k++]=arr[str.length()-1];
            for(int i=0;i<k;i++){
                System.out.print(arr[i]);
            }
        }
    }

