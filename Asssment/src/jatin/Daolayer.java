package jatin;

public class Daolayer { 
	String[] memail= {"jatinverma009@gmail.com","tinej77667@orcut.com","abcd34@gl.eu","fine@yaho.com","hello1245@trivago.com"};
	String[] mpassword= {"12345678","123456789","helloindia","thiscantbedone","123456jatin"};
	
	
	void showUser(String email,String password,String name,int age) throws Exception
	{   for(int i=0;i<5;i++)
	{
		 if(memail[i].equals(email))
		 { if(mpassword[i].equals(password))
	       {  
	    	 System.out.println("name:"+name);
	    	 System.out.println("email:"+email);
	    	 System.out.println("password:"+password);
	    	 System.out.println("age:"+age);
	    	 break;
	     }
	     else
	     { 
	    	 throw new Exception("invalid password");   
	     }
	 }  else{ throw new Exception("invalid email"); 
		     
	
	    }
	}
		
	}	 
		 
	}
	
	    
	   
