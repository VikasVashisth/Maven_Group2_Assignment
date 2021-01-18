package com.knoldus;
import java.util.*;
import java.lang.*;


public class Application {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        StringFunctions rev=new StringFunctions();
        rev.reverse(s);
        rev.count(s);
        sc.close();
    }
}
