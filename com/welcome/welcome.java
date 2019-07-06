package com.welcome;

import com.information.GetAccount;
import com.information.GetEmails;
import com.information.GetMail;
import com.service.Send;

public class welcome 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to GMAIL Mass Mailing Service.");
		String em = GetAccount.getEmail();
		String psw = GetAccount.getPassword();
		String sub = GetMail.getSubject();
		String msg = GetMail.getMessage();
		
		String xemail[] = GetEmails.fetchEmails();
		int remaining = GetEmails.getN();
		
		boolean status = false;
		System.out.println("Sending Emails to "+remaining+" peoples...\n");
		
		for (int i=0; i<remaining; i++)
		{
			status = Send.sendMail(xemail[i], sub, msg, em, psw);
			if (status == false)
				System.out.println("Email could not be delivered to "+ (i+1) +"th person.");
			else
				System.out.println("Sent to  "+ (i+1) +"th person.");
		}
		System.out.println("\n\nEmail sending successfully completed.");
		System.out.println("Thanks for being with us.");

	}

}
