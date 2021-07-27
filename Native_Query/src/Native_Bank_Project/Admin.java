package Native_Bank_Project;

import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank_Methods bm= new Service();
		while(true)
		{
		System.out.println("------Welcome to online Banking-----------");
        System.out.println("1.Add acoount \n"+"2.View account\n" +"3.Withdraw Money\n "+"4.Deposit Money\n"
        		+ "5.Update Account\n "+ "6.Delete Account\n"+"7.Exit");
        
        System.out.println("Select the choice");
        int ch= sc.nextInt();
        switch(ch)
        {
        case 1: 
        	bm.Addaccount();
        	break;
        	
        case 2:
        	bm.ViewAccount();
        	break;
        	
        case 3:
        	bm.WithdrawnMoney();
        	break;
        	
        case 4:
        	bm.DepositMoney();
        	break;
        	
        case 5:
        	bm.Updateaccount();
        	break;
        	
        case 6:
        	bm.Deleteaccount();
        	break;
        	
        case 7:
        	System.out.println("Wrong i/p");
        	System.exit(0);
        	
        }
	}
	}
}
