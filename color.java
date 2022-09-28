class color{
	static String[]allColors={null,null,null,null,null,null,null};
	static int position=0;
	static void save(String colors)
	{
		if(position>=7)
		{
			System.out.println("main ");
			return;
		}
		if(allColors!=null && colors.length()>=3)
		{
			System.out.println("start");
	        allColors[position]=colors;
	        System.out.println("position"+position+"=:"+colors);
            position++;	
		}
	}
	static void desply()
	{
		for(int point=0;point<allColors.length;point++)
		{
			String index=allColors[point];
			System.out.println(index);
		}
	}
	static boolean checkColor(String colors)
	{
		if(allColors!=null && colors.length()>=3)
		{
			for(int info=0;info<allColors.length;info++)
			{
				System.out.println("color is in the memory");
				String ref=allColors[info];
				if(ref==colors)
				{
					System.out.println("found the color:"+colors);
					return true;
				}
			}
		}       
			else
		         {
			      System.out.println("color not in memory");
		         }
				 return false;
	}	
}