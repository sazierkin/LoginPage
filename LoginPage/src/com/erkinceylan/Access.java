package com.erkinceylan;

import java.util.Scanner;

class Access {
	public Scanner kb;
	public String Username, Password;
	
	public Access(String uname, String password)
	{
		kb = new java.util.Scanner(System.in);
		Username = uname;
		Password = password;		
	}
	
	public boolean granted(String uname, String password)
	{
		return Username.equals(uname) && Password.equals(password);
	}
	
	public void run()
	{	
		System.out.println("You have 3 (three) rights to enter your password and username");
		
		int tryNum = 3;
		int i;
		
		for (i = 0; i < tryNum; ++i) {
			System.out.print("Username?");
			String username = kb.nextLine();
			System.out.print("password?");
			String password = kb.nextLine();
			
			if (granted(username, password))
				break;
			
			if (i != tryNum - 1) {
				System.out.println("Wrong entry.Please try again");
				System.out.printf("You have %d rights to enter right username and password %n", tryNum -i - 1);
			}
		}
		if (i < tryNum) {
			System.out.println("Login successful");
		}
		else
			System.out.println("You can not try to access anymore.Please call customer representative.");	
		
	}
}
	
