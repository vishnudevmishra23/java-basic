package com.codes.basic;
import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
		int x;
		double y;
		String z;
		char c;
		
		//System.out.println("enter integer value:");
		Scanner sc=new Scanner(System.in);
        //x=sc.nextInt();
        //System.out.println("Intriguer value"+x);
        System.out.println("Enter the character");
        c=sc.next(".").charAt(0);
        System.out.println(c);
        

	}

}
