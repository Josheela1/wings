class BillionairesRunner{
	public static void main(String args[]){	
	System.out.println("main start");		
	Billionaires.save("Elon Musk");
	Billionaires.save("Bernard Arnault & family");
	Billionaires.save("Gautam Adani & family");	
	Billionaires.save("Jeff Bezos");	
	Billionaires.save("Bill Gates");	
	Billionaires.save("Warren Buffett");
	Billionaires.save("Larry Ellison");
	Billionaires.save("Mukesh Ambani");		
	Billionaires.save("Larry Page");	
	Billionaires.save("Sergey Brin");
	Billionaires.displayDetails();	
	boolean value=Billionaires.find("Mukesh Ambani");	
	System.out.println(value);		
	String result= Billionaires.update("Jeff Bezos","rathan tata");	
	System.out.println(result);		
	Billionaires.displayDetails();		
	String result1= Billionaires.update("2","sudha murthy");	
	System.out.println(result1);	
	Billionaires.displayDetails();	
	Billionaires.delete("Elon Musk");	
	Billionaires.displayDetails();		
	Billionaires.delete1(8,"Larry Page");	
	Billionaires.displayDetails();			
    } 
}