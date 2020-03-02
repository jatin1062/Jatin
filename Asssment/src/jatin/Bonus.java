package jatin;

public class Bonus {
	static int bonus;
	    

		 public static void main(String[] args)
			{   Department dept=new Department();
			     dept.setDname("IT");
			     dept.setEmp(new Employee[6]);
			     dept.getEmp()[0]=new Employee("ram",31,"male",new Address("delhi","delhi","india"),1200000,1999);
			     dept.getEmp()[1]=new Employee("mark",25,"male",new Address("tokyo","tokyo","japan"),800000,1999);
			     System.out.println(dept.getDname());
			      for(int i=0;i<2;i++){
			    	 System.out.println(dept.emp[i]);
			    	 }
			    	 for(int i=0;i<2;i++){
			    	   if(dept.getDname().equals("IT"))
			    	  {  bonus = dept.emp[i].getSalary()*2/100;
			    	        if(dept.emp[i].getAd().getCountry().equals("India")){
			    		          if(dept.emp[i].getGender().equals("male")&& dept.emp[i].getDoj()>2000)
			    		   {
			    			   bonus = dept.emp[i].getSalary()*10/100;
			    		   }
			    		   if(dept.emp[i].getGender().equals("female")&& dept.emp[i].getDoj()>2000)
			    		   {
			    			    bonus = dept.emp[i].getSalary()*12/100;   
			    		   }
			    		   else
			    		   {
			    			   bonus = dept.emp[i].getSalary()*5/100;  
			    		   }
			    			   
			    	 }
			    	  }
			    	 else{
			    		  if(dept.getDname().equals("Security"))
			    		  {bonus = dept.emp[i].getSalary()*3/100;
			    	        if(dept.emp[i].getAd().getCountry().equals("India")){
			    		          if(dept.emp[i].getGender().equals("male")&& dept.emp[i].getDoj()>2000)
			    		   {
			    			   bonus = dept.emp[i].getSalary()*10/100;
			    		   }
			    		   if(dept.emp[i].getGender().equals("female")&& dept.emp[i].getDoj()>2000)
			    		   {
			    			    bonus = dept.emp[i].getSalary()*12/100;   
			    		   }
			    		   else
			    		   {
			    			   bonus = dept.emp[i].getSalary()*5/100;  
			    		   }
			    			   
			    			  
			    			  
			    			  
			    		  }
			    		   
			    	 }
			    	 }
			     
			     
			     
			
			      
			
		

	 }
	  

}}
