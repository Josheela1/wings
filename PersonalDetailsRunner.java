class PersonalDetailsRunner{
	public static void main(String[] args) {
		System.out.println("entered main method....");
		PersonalDetails.printName("Joshi");
		PersonalDetails.printNameAndEmail("Joshi","Joshi@gmail.com");
		PersonalDetails.printNameAndPhoneNo("Joshi",1234567891L);
		PersonalDetails.printNameAndAge("Joshi",22);
	}
}