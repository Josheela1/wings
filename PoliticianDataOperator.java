class PoliticianDataOperator{
	static String[]PoliticianNames={null,null,null,null,null};
	static int position=0;
	static void save(String name){
		System.out.println("save: start aytu");
		PoliticianNames[position]=name;
		position++;
		System.out.println("save:"+name+"in position"+position);
		System.out.println("save:mugithu");
	}
	static void displayName(){
		for(int index=0;index<PoliticianNames.length;index++){
			String ref=PoliticianNames[index];
            System.out.println(ref+"names");
		}			

}
}