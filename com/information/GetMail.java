package com.information;

import java.util.Scanner;

public class GetMail 
{

	public static String getSubject() 
	{
		String subject = null;
		
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("Enter the Subject for your mail : ");
			subject = sc.next();
			if(subject == null)
				System.out.println("Subject Cannot be null.");
		}while (subject == null);
		
		
		return subject;
	}

	public static String getMessage() 
	{
		String message = null;
		
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("Enter the Message for your mail : ");
			message = sc.next();
			if(message == null)
				System.out.println("Message Cannot be null.");
		}while (message == null);
		
		return message;
	}
	

}
