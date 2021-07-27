package Native_curd_project;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Lib_Methods lib=new Method_impli();
		System.out.println("----Welcome to Library Management---");
		System.out.println("1.Insert data"+"\n2.View all data"+"\n3.Update data"+"\n4.Dalete data"+"\n5.Exit");
		System.out.println("Select the above option");
		int ch= sc.nextInt();
		switch(ch)
		{
		case 1:
			lib.insertbook();
			break;
			
		case 2:
			lib.viewallbook();
			break;
			
		case 3:
			lib.updatebook();
			break;
			
		case 4:
			lib.deletebook();
			break;
			
		case 5:
			System.out.println("Wrong i/p");
			System.exit(0);
		}

	}

}
