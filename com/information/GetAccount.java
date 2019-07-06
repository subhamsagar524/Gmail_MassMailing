package com.information;

import java.util.Scanner;

public class GetAccount 
{
	static Scanner sc = new Scanner(System.in);
	public static String getEmail() 
	{
		String email = null;
		
		System.out.println("Enter you Gmail account ID : ");
		email = sc.next();
		
		return email;
	}
	public static String getPassword() 
	{
		String password = null;
		
		System.out.println("Enter you Gmail account Password : ");
		password = sc.next();
		
		return password;
	}
	

}
