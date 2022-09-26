class FoodItemsDataOperator{
	static String[]FoodNames={null,null,null,null,null};
	static int position=0;
	static void save(String name){
		System.out.println("save: start aytu");
		FoodNames[position]=name;
		position++;
		System.out.println("save:"+name+"in position"+position);
		System.out.println("save:mugithu");
	}
	static void displayName(){
		for(int index=0;index<FoodNames.length;index++){
			String ref=FoodNames[index];
            System.out.println(ref+"names");
		}			

}
}