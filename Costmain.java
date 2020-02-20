package com.epam.Serialization;

import java.util.Scanner;


public class Costmain extends Housecost{
Scanner s=new Scanner(System.in);
    
	void Costmain()
	  	{
	  		
	Scanner sc=new Scanner(System.in);

	System.out.format("Enter the choices if you need fully automated home\n1.YES\n2.NO");
	  		
	int choices=sc.nextInt();
		
System.out.format("Enter the area of site in square feet");
		
float area=sc.nextFloat();
		
	  		
	if (choices==1)
	  		{
	  			
	System.out.format("select the type of house you need\n1.Standard material\n2.Above Standard material\n3.High Standard material");
	  			
	int choices1=sc.nextInt();
	  			
	if (choices1<1 && choices1>3)
	  			{
	  				
	System.out.format("Enter valid choices");
	  			
	}
	  			
	else
	  			{
	  				
	System.out.format("cost of house construction : "+homeconstruct_cost(choices1,area));
	  			
	}
	  		
	}
	  		
	
	  		
	else
	  		
	{
	  			
	System.out.format("Enter valid choices");
	  	
		}
	  
		}
	  	
	public static void main(String args[])
	  	{
	  	
		Costmain obj1=new Costmain();
	  		
	obj1.Costmain();
	  	
	}


}
