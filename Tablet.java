class Tablet{
	static String name;
	static double price;
	static String inKannada;
	static String combination;
	static String company;
	static double priceForSheet;
	static boolean availability;
	static String mfdDate;
	static String expDate;
	static boolean forChildren;
	static int rating;
	static int perDay;
	static String intakeWith;
	static int Stock;
	static String mfdPlace;
	static String transport;
	static boolean homeDelivery;
	
	static String[] otherCompany;
	static String[] otherTablet;
	static double[] difPrices;
	static String[] cures;
	static String[] avaiableIn;
	static String[] color;
	static String[] stores;
	static char[] boxSize;
	static int[] sheetSize;
	static String[] reviews;
	static String[] shapes;
	static int[] marks;
	
	static void tabletDetails(){
		System.out.println(name);
		System.out.println(price);
		System.out.println(inKannada);
		System.out.println(combination);
		System.out.println(company);
		System.out.println(priceForSheet);
		System.out.println(availability);
		System.out.println(mfdDate);
		System.out.println(expDate);
		System.out.println(forChildren);
		System.out.println(rating);
		System.out.println(perDay);
		System.out.println(intakeWith);
		System.out.println(Stock);
		System.out.println(mfdPlace);
		System.out.println(transport);
		System.out.println(homeDelivery);
		
		if(otherCompany!=null) {
			for(int position=0;position<otherCompany.length;position++)
			{
				String ref1=otherCompany[position];
				System.out.println(ref1);
			}
		}
		else {
			System.out.println("array is  null");
		}
		if(otherTablet!=null) {
			for(int position=0;position<otherTablet.length;position++)
			{
				String ref2=otherTablet[position];
				System.out.pringtln(ref2);
			}
		}
		else{
			System.out.println("array is null");
		}
		if(difPrices!=null) {
			for(8nt position=0;position<difPrices.length;position++)
			{
				double ref3=difPrices[position];
				System.out.println("array is zero");
			}
			else {
				System.out.println("array is zero");
			}
			if(cures!=null) {
				for(int position=0;position<cures.length;position++)
				{
					String ref4=cures[position];
					System.out.println(ref4);
				}
			}
			else{
				System.out.println("array is null");
			}
			if(availablrIn!=null)
			{
				for(int position=0;position<avaiableIn.length;position++)
				{
					String ref5=available[position];
					System.out.println(ref5);
				}
			}
			else {
				System.out.printn("array is null");
			}
			if(color!=null) {
				for(int position=0;position<color.length;position++)
				{
					String ref6=color[position];
					System.out.println(ref6);
				}
			}
			else {
				System.out.println("array is null");
			}
			if(stores!=null) {
				for(int position=0;position<stores.length;position++)
				{
					String ref7=stores[position];
					System.out.println(ref7);
				}
			}
			else{
				System.out.println("array is null");
			}
			if(boxSize!=null) {
				for(int position=0;position<boxSize.length;position++)
				{
					char ref8=stores[position];
					System.out.println(ref8);
				}
			}
			else{
				System.out.println("array is null");
			}
			if(sheetSize!=null) {
				for(int position=0;position<sheetSize.length;position++)
				{
					int ref9=sheetSize[position];
					System.out.println(ref9);
				}
			}
			else{
				System.out.println("array is zero");
			}
			if(reviews!=null){
				for(int position=0;position<reviews.length;position++)
				{
					String ref10=reviews[position];
					System.out.println(ref10);
				}
			}
			
			
				