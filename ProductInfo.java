class ProductInfo{
	public static void main(String[] info){
		String productName=info[0]; 
		String productType=info[1];
		String productQuantity=info[2];
		String productPrice=info[3];
		System.out.println("product name is :"+productName);
		System.out.println("product type is :"+productType);
		System.out.println("product price is :"+productPrice);
		System.out.println("product quality is :"+productQuantity);
		
		int convertedPrice=Integer.parseInt(productPrice);
		System.out.println("converted price is :"+convertedPrice);
		if(convertedPrice<=25){
			System.out.println("pouch is of less price");
		}
		else{
			System.out.println("pouch is too costly");
		}
		int convertedQuantity=Integer.parseInt(productQuantity);
		System.out.println("converted quantity is"+convertedQuantity);
		if(convertedQuantity<=30){
			System.out.println("can be used upto 3months");
		}
		else{
			System.out.println("need to wait");
		}
		int total=convertedPrice*convertedQuantity;
		System.out.println("total price is: "+total);
	}
}
		