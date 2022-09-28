class Festival{
	void save(String name);
	void displayDetails();
	boolean findFestival(String name);
	String update(String oldName,String newName){
		System.out.println("fest not found"+name);
		return false;
	}
	static String update(String oldName,String newName){
		System.out.println("update start aytu");
		if(oldName!=null && newName!=null){
			if(oldNamelength()>5 && newName.length()>5){
				System.out.println("fest date is valid,can update");
				for(int index=0;index<festivalNames.length;index++)
				{
					String ref=festivalNames[index];
					if(oldName==ref){
						System.out.println("festival updated"+ref+"with");
						festivalNames[index]=newName;
						return newName;
					}
				}
			}
			else{
				System.out.println("fest data is invalid,cannot update");
			}
		}
		return newName;
	}
}