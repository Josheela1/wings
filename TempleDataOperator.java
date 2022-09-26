class TempleDataOperator{
	static String[]TempleNames={null,null,null,null,null};
	static int position=0;
	static void save(String name){
		System.out.println("save: start aytu");
		TempleNames[position]=name;
		position++;
		System.out.println("save:"+name+"in position"+position);
		System.out.println("save:mugithu");
	}
	static void displayName(){
		for(int index=0;index<TempleNames.length;index++){
			String ref=TempleNames[index];
            System.out.println(ref+"names");
		}			

}
}