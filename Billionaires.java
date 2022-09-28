class Billionaires{
	static String billionaires[]={null,null,null,null,null,null,null,null,null,null};
	static int location=0;
	static void save(String billionaire)
	{	
	
        System.out.println("save start");	
		if(location>=10)
		{
			System.err.println("array size exceeds");
		}	
		if(billionaire!=null&& billionaire.length()>5)	
        {
		   System.out.println("name is valid "+billionaire);	
		   billionaires[location]=billionaire;
		   location++;	
		}	
		else{	
		System.out.println("name is invalid");
		}
		
	}
	static void displayDetails()
	{
	 for (int index=0;index<billionaires.length;index++)
	{
		String ref=billionaires[index];
		System.out.println("element is "+ref);	
	}
	}
	static boolean find(String name)
    {
		if(name!=null&& name.length()>5)	
		{		
			System.out.println("name is valid and finding in the array");
			for (int index=0;index>billionaires.length;index++)	
			{			
			    String ref=billionaires[index];	
			    if(ref==name)	
			    {			
	     		   System.out.println("billionarie found "+name);	
				   return true;	
			    }	
			}			
		}				
		return false;
	} 
 static String update(String oldBillionaire,String newBillionaire) 
 {	 
	System.out.println("update start");	
	if(oldBillionaire!=null && newBillionaire!=null)	 
	{		
	   if(oldBillionaire.length()>5 &&newBillionaire.length()>5)		
	   {			
	       System.out.println("data is valid for updartion");	
	   }
	for(int index=0;index<billionaires.length;index++)
		 {	
		    String ref=billionaires[index];	
			if(oldBillionaire==ref)	
			{		
			  System.out.println("value found "+oldBillionaire);	
			  billionaires[index]=newBillionaire;		
			  System.out.println("value updated");		
			  return newBillionaire;	
			}
		 }		 	
	  }	
	  else{		
	        System.out.println("data not valid for updation");
          }	 
	       return null; 
	} 
	static String update(int index,String newBillionaire)
	{	
	if( newBillionaire!=null && newBillionaire.length()>5)	
		{		
        	System.out.println("data valid for updation ");		
			billionaires[index]=newBillionaire;
			return newBillionaire;
		}	 
		return null;
	} 
	static boolean delete(String billionaire) 
	{	
		System.out.println("delete start");	 
		if(billionaire!=null && billionaire.length()>5)	
		{		 
	        System.out.println("data is valid");		 
			for(int loc=0;loc<billionaires.length;loc++)		
			{			
         		if(billionaires[loc]==billionaire)			
					billionaires[loc]=null;			 
				System.out.println("deleted");			
				return true;		
			}	
		 	 
		}
		return false;
	}
	static boolean delete1(int index,String billionaire)
	{	
	   if(billionaire!=null&&billionaire.length()>5)
	   {	
 	      System.out.println("data is valid");		
          billionaires[index]=null;
		  System.out.println("deleted");
		  return true;
	   }
	   return false;
	}
	}
	