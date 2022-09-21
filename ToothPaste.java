class ToothPaste{
	static double price=60D;  //
	static String flavour; //
	static String brand; //
	static int size; //
     //
	static String color; //
    
  
    static void setBrand(String value){
		brand=value;
	}
	static String getBrand() {
		return brand;
	}
	
		
	static void setFlavour(String value) {
		flavour=value;
	}
	static String getFlavour() {
		return flavour;
	}
	
	
	static void setPrice(double value) {
		price=value;
	}
	static double getPrice(){
        return price;
    }
	
	static void setSize(int value)
	{
		size=value;
	}
	static int getSize(){
		return size;
	}
	
	
    
	static void setColor(String value) {
		color=value;
	}
	static String getColor() {
		return color;
	}
	
	static void displayDetails() {
		System.out.println(price);
		System.out.println(brand);
		System.out.println(flavour);
		System.out.println(size);
		
		System.out.println(color);
}
}
   		