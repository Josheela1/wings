class BillionairesRunner{
	public static void main(String args[]){	
	System.out.println("main start");		
	Festivals.save("Dasara");
	Festivals.save("Diwali");
	Festivals.save("Ganesh Chaturthi");	
	Festivals.save("Sankranthi");	
	Festivals.save("Holi");	
	Festivals.save("Varamahalakshmi");
	Festivals.save("Ugadi");
	Festivals.save("Navratri");		
	Festivals.save("Nagapanchami");	
	Festivals.save("eid");
	Festivals.displayDetails();	
	boolean value=Festivals.find("Ganesh Chaturthi");	
	System.out.println(value);		
	String result= Festivals.update("sankranthi","christmas");	
	System.out.println(result);		
	Festivals.displayDetails();		
	String result1= Festivals.update("2",bakrid");	
	System.out.println(result1);	
	Festivals.displayDetails();	
	Festivals.delete("holi");	
	Festivals.displayDetails();		
	Festivals.delete1(8,"nagapanchami");	
	Festivals.displayDetails();			
    } 
}