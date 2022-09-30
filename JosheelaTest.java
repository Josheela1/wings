Platform Independence 
Platform independence means that java compiled code{i.e byte code) can run on all operating systems.
Java is platform independent as it uses JVM(Java Virtual Machine).
Byte code makes java platform independent.JVM is platform 

2.Primitive datatypes are keywords.

Primitive datatypes are predefined and they have special meaning which is predefined in memory.
Every keyword has its own meaning.
Primitive datatype starts with lowercase letter.
Primitive datatype stored data only in one type.
Primitive datatype are inbuilt.
There are 8 primitive datatypes in java.Primitive datatypes are byte,short,int,char,long,float,double,boolean.
Primitive data structure must contain some value but not Null.
Primitive datatype can be used to call the methods.

Non primitive dataypes are not predefined except String.
Non primitive datatypes are arrays,strings,stack,queue,linked list,tree,graph.
Non primitive datatype starts with upper case letter.
Non Primitive datatypes are user defined.
it stored data of different types.
Non Primitive data structure can contain Null value.
non Primitive data structure cannot be used to call the methods.
Any class we declare becomes non primitive.


Class is a basic entity in an object oriented programming.
Class is a buleprint of an object.
An object is an instance of class.
In an object oriented programming class is declared using keyword "Class".
Every class contains data members and methods.
A class has states and behaviours.
every java program we write Starts with keyword Class.
The main method looks for class keyword and then starts the execution.
Class is used to create objects which shares common properties and methods.
the class keyword must be followed by class name.
syntax: class ClassName{
//statements;
}
example
class ClassName{
a=b; //statement
	
}

4.Program to accept two inputs total marks and received marks.Calculate percentage and return

class GFG{
   public static void main(String[] args) {
     int n=5; totalmarks=0;
     float percentage;
   
     int marks[]={20,30,45,96,60};
     for(int i=0;i<n;i++){
		 totalmarks+=marks[i];
	 }
     System.out.println("Total marks are:"+totalmarks);
	 percentage=(totalmarks/n);
	 System.out.println("total percentage:"+percentage+"%");
	 
   }
}   


6. Main method
the main method main()  is the starting point to start execution of Java program.
Without main() JVM will not execute the program.
syntax public static void main(String[] args)
{
	
} 

7.program to reverse a number 

class ReverseNumber{
	public static void main(String[] args){
		int number=9876,reverse=0;
		while(number!=0){
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		System.out.println("the reverse of the given no is:"+reverse);
	}
}

9.Program to find Armstrong number
class Armstrong{
	public static void main(String[] args) {
		int number=371,originalNumber,remainder,result=0;
		originalNumber=number;
		while(originalNumber1=0){
			remainder=originalNumber%10;
			sum=sum+power( remainder,result);
			originalNumber/10;
			
		}
		if(result==number){
			System.out.println(number"is an Armstrong number");
		}
		else{
			System.out.println(number+"is not an armstrong number");
		}
	} 
}

8.class Time{
	
	public static void main(String[] args){
		
		
	}
}