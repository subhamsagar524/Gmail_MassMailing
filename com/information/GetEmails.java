package com.information;

import java.util.Scanner;

public class GetEmails 
{
	static int n = 0;
	public static String[] fetchEmails() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Email address to send the mail : ");
		n = sc.nextInt();
		System.out.print("Enter E-Mail ID : ");
		String emails[] = new String[n];
		char ch;
		int i = 0;
		do {
			System.out.println(" Email  "+(i+1)+"  ");
			emails[i] = sc.next();
			i++;
			}while(i < n);
		
		return emails;
	}
	public static int getN() {
		return n;
	}

}
