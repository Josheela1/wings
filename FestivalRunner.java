class Festivalrunner{
	public static void main(String[] args){
		System.out.println("main entered");
		Festival.save("Dasara");
		Festival.save("varamahalakshmi");
		Festival.save("sankranthi");
		Festival.save("Diwali");
		Festival.save("Ganestchaturthi");
		Festival.save("holi");
		Festival.update("sankranthi","bakrid");
		Festival.displayDetails();
		
		boolean found=Festival.findFestival("Dasara");
		System.out.println("festival found"+found);
	}
}