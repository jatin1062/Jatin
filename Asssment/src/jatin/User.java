package jatin;
import java.util.Scanner;

public class User {
	static String name;
	static String email;
	static String password;
	 static int age;
	
	 public static void main(String[] args)
	 {    Scanner obj = new Scanner(System.in);
		   System.out.println("Enter name of the user:");
		    name=obj.nextLine();
		    System.out.println("Enter email of user:");
		    email=obj.nextLine();
		    System.out.println("Enter password of user:");
		    password=obj.nextLine();
		    System.out.println("Enter age of user:");
		    age=obj.nextInt();	
		    BusinessLayer bs=new BusinessLayer();
		    try
		    {
		      bs.validation(email,password);
		    
		    }catch(Exception e)
		    {
		    	System.out.println(e.getMessage());
		    }
		    
		     Daolayer d=new Daolayer();
		     try
			    {
			      d.showUser(email,password,name,age);
			    
			    }catch(Exception e)
			    {
			    	System.out.println(e.getMessage());
			    }
		     
		     
		  
		    
		    
	 }
}
