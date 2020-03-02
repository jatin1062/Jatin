package jatin;

public class BusinessLayer {
	   void validation(String email,String password) throws Exception
	 {      String re="[A-Za-z0-9.]+[@][A-Za-z]+[.][a-z]+";
		  if(email==null && password==null)
		  { 
			  throw new Exception("Email or Password is null"); 
		  }
		  
		  if(email.matches(re))
		  {}
		  else
		  {  throw new Exception("Not a valid email id"); }
		  
		   if(password.length()<8)
		   {  
			   throw new Exception("Password length is less than 8 ");
		   }	 	  
	 }

} 
