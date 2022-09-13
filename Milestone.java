class Milestone{
	static void showTheResponsibility()
	{
		System.out.println("Entered showTheResponsibility");
		int age=22;
		char gender='F';
		if(age==10){
			System.out.println("school");
		}
		if(age==16) {
			System.out.println("college");
		}
		if(age==18 && gender=='F')
		{
			System.out.println("voterId");
			System.out.println("drivingLicense");
			if(gender=='F')
			{
				System.out.println("Girls can legally marry");
			}
		}
		System.out.println("exiting showTheResponsibility");
		if(age==21)
		{
			System.out.println("Legal age for boys to marry");
		}
		if(age==21 ||age==22)
		{
			System.out.println("Graduate");
		}
		if(age==23 || age==25)
		{
			System.out.println("By this age a person will have job");
		}
        if(age==28)
		{
            System.out.println("kids");
        }
        if(age==30)
        {
            System.out.println("having another kid");
        }
        if(age==45)
        {
            System.out.println("Kids Future");
        }
        if(age==50)
        {
            System.out.println("Kids Education");
		}
        if(age==58)
        {
            System.out.println("Retirement");
		}
        if(age==60)
        {
            System.out.println("Grand Kids");
		}
        if(age==70)
        {
            System.out.println("RIP");
	}
	}
}
	