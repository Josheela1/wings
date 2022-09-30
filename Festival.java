class Festival{
	static String billionaires[]={null,null,null,null,null,null,null,null,null,null};
	static int location=0;
	static void save(String fest)
	{	
	
        System.out.println("save start");	
		if(location>=10)
		{
			System.err.println("array size exceeds");
		}	
		if(fest!=null&& fest.length()>5)	
        {
		   System.out.println("name is valid "+fest);	
		   festivals[location]=fest;
		   location++;	
		}	
		else{	
		System.out.println("name is invalid");
		}
		
	}
	static void displayDetails()
	{
	 for (int index=0;index<festivals.length;index++)
	{
		String ref=festivals[index];
		System.out.println("element is "+ref);	
	}
	}
	static boolean find(String name)
    {
		if(name!=null&& name.length()>5)	
		{		
			System.out.println("name is valid and finding in the array");
			for (int index=0;index>festivals.length;index++)	
			{			
			    String ref=festivals[index];	
			    if(ref==name)	
			    {			
	     		   System.out.println("fest found "+name);	
				   return true;	
			    }	
			}			
		}				
		return false;
	} 
 static String update(String oldFest,String newFest) 
 {	 
	System.out.println("update start");	
	if(oldFest!=null && newFest!=null)	 
	{		
	   if(oldFst.length()>5 &&newFest.length()>5)		
	   {			
	       System.out.println("data is valid for updartion");	
	   }
	for(int index=0;index<festivals.length;index++)
		 {	
		    String ref=festivals[index];	
			if(oldFest==ref)	
			{		
			  System.out.println("value found "+oldFest);	
			  Festivals[index]=newFest;		
			  System.out.println("value updated");		
			  return newFest;	
			}
		 }		 	
	  }	
	  else{		
	        System.out.println("data not valid for updation");
          }	 
	       return null; 
	} 
	static String update(int index,String newFest)
	{	
	if( newFest!=null && newFest.length()>5)	
		{		
        	System.out.println("data valid for updation ");		
			festivals[index]=newFest;
			return newFest;
		}	 
		return null;
	} 
	static boolean delete(String fest) 
	{	
		System.out.println("delete start");	 
		if(fest!=null && fest.length()>5)	
		{		 
	        System.out.println("data is valid");		 
			for(int loc=0;loc<festivals.length;loc++)		
			{			
         		if(festivals[loc]==fest)			
					festivals[loc]=null;			 
				System.out.println("deleted");			
				return true;		
			}	
		 	 
		}
		return false;
	}
	static boolean delete1(int index,String fest)
	{	
	   if(fest!=null&&fest.length()>5)
	   {	
 	      System.out.println("data is valid");		
          festivals[index]=null;
		  System.out.println("deleted");
		  return true;
	   }
	   return false;
	}
	}
