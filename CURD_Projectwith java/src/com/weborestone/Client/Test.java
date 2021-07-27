package com.weborestone.Client;

import java.util.Scanner;

import com.weborestone.service.Service;
import com.weborestone.serviceImpl.Impl;

public class Test {

	public static void main(String[] args) {
		Service s= new Impl();
     Scanner sc= new Scanner(System.in);
     System.out.println("------Welcome to CURD Operation ------");
     while(true)
     {
     System.out.println("1.Insert the data " +" \n2.Update the data " +" \n3.Retreive the data "
                       +" \n4.Delete the data " +" \n5.UPdate" +" \n6.EXIT");
     System.out.println("Select the above option");
     int ch= sc.nextInt();
     switch(ch)
     {
     case 1:
    	    s.insertdata();
    	    break;
    	    
     case 2:
    	 s.updatedata();
    	 break;
    	 
     case 3:
    	 s.retreivedata();
    	 break;
    	 
     case 4:
    	 s.deletedata();
    	 break;
    	 
     case 5:
    	 s.update();
    	 break;
    	 
     case 6:
    	 System.out.println("Wrong i/p");
    	 break;
    	 
    	default:
    		System.exit(0);
     
     }
     }

	}

}
