package com.company.string;

import java.util.HashMap;
import java.util.Scanner;

public class Pattern {
    public static boolean findPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern:");
        String pattern = sc.nextLine();
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        if(pattern==null || pattern.length()==0||str==null||str.length()==0){
            return false;
        }
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String s=arr[i];
            if(!map.containsKey(c)){
                if(map.containsValue(s)){
                    return false;
                }
                map.put(c,s);
            }
            else if(!map.get(c).equals(s)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        boolean bool=findPattern();
        System.out.println(bool);
    }
}