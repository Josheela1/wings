class CoffeeRunner {
	public static void main(String[] info) {
		System.out.println("main started :");
		
		
			System.out.println("main started");
			String hotelName=info[0];
			String price=info[1];
			String sugar=info[2];
			
			
			System.out.println("hotel name is :"+hotelName);
			System.out.println("coffee price is :"+price);
			System.out.println("with sugar or without sugar :"+sugar);
			int convertedPrice=Integer.parseInt(price);
			System.out.println("convertedprice :"+convertedPrice);
			if(convertedPrice==10){
				System.out.println("price is ok");
			}
			else{
				System.out.println("ee coffee ge ishtodu price aa...");
			}
		    boolean convertedSugar=Boolean.parseBoolean(sugar);
			if(convertedSugar){
				System.out.println("coffee is ready");
			}
			else{
				System.out.println("coffee is wakk");
			}
		}
		
		
		
	
}