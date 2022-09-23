class ToothPasteRunner {
	public static void main(String[] args){
		System.out.println("entered main");
		
		ToothPaste.color="White";
		ToothPaste.setPrice(120d);
		ToothPaste.setFlavour("neem");
		ToothPaste.setBrand("Colgate");
		ToothPaste.setSize(50);
		double price=ToothPaste.getPrice();
		if(price>100) {
			System.out.println("it is costly");
		}
		else{
			System.out.println("price is ok");
		}
		String flavour=ToothPaste.getFlavour();
		if(flavour=="neem") {
			System.out.println("good for teeth");
		}
		else{
			System.out.println("it is still fine");
		}
		String brand=ToothPaste.getBrand();
		if(brand=="Patanjali"){
			System.out.println("brand is patanjali");
		}
		else{
			System.out.println("brand is not patanjali");
		}
		String color=ToothPaste.getColor();
		if(color=="grey"){
			System.out.println("color is grey");
		}
		else{
			System.out.println("colour is not grey");
		}
		int size=ToothPaste.getSize();
		if(size>50){
			System.out.println("toothpaste is more than 100grams");
		}
		else{
			System.out.println("toothpaste is not more than 100grams in size");
		}
		
		
	
		System.out.println("main terminated");
	}
}