class CardRunner {
	public static void main(String[] args) {
		Card.displayDetails();
		Card.type="Credit Card";
		Card.width=28;
		Card.price=36.880d;
		String[] colour={"Mirage Silver","Pine Green","Lake Blue","Grey"};
		Card.color=colour;
		Card.displayDetails();
	}
}