class Zomato{
	static double deliverFood(String item){
		System.out.println("entered deliver food");
		System.out.println("item :"+item);
		if(item=="biryani")
		{
			System.out.println("biryani");
			return 200;
		}
		if(item=="Tandoori")
		{
			System.out.println("Tandoori");
			return 180;
		}
		return 0.0;
	}
}

		
