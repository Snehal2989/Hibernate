package CURD_operation;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Method m= new Impl_Method();
		System.out.println("\n1.Insert the data" +"\n2.Retreive all the data" +"\n3.Retreive singla data"
		              +"\n4.Update the data"+"\n5.Delete the data"+"\n6.Ins_data");
		System.out.println("select the above choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			   m.insertData();
			   break;
			   
		case 2:
			m.retreiveall();
			break;
			
		case 3:
			m.retreivesingledata();
			break;
			
		case 4:
			m.updatedata();
			break;
			
		case 5:
			m.deletedata();
			break;
			
		case 6:
			m.ins_data();
			break;
		}

	}

}
