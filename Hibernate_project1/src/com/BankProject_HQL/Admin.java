package com.BankProject_HQL;

import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Bank_methods b= new Imp_Method();
		boolean b1=true;
		System.out.println("------Welcome to online Banking-----------");
		while(b1)
			{
		System.out.println(" 1. Add the account "+ " "+ " \n2. View the account " +" "+ " \n3. WithdrawnMoney the money" 
		                   +" "+ " \n 4. Deposit the money " +" "+ " \n5. Update the account "+" "+" \n6. Delete the account "+" "+ " \n7. Exit");
		System.out.println("Select the above choice");
		int ch= sc.nextInt();
		switch(ch)
		{
		case 1:
			b.Addaccount();
			break;
			
		case 2:
			b.ViewAccount();
			break;
			
		case 3:
			b.WithdrawnMoney();
			break;
			
		case 4:
			b.DepositMoney();
			break;
			
		case 5:
			b.Updateaccount();
			break;
			
		case 6:
			b.Deletedata();
			break;
			
		case 7:
			System.out.println("Wrong i/p");
			System.exit(0);
			
		 }
		
    	}
	}

}
