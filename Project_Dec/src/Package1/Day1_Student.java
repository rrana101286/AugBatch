package Package1;

public class Day1_Student 
{

	int roll_No;
	int age;
	public void display1()
   {
		System.out.println("Wlcome to all of you" );
   }
	public void display2()
	   {
			System.out.println("Automation is very easy" );
	   }
   public static void main(String[] args) 
   {
	  Day1_Student abc=new Day1_Student();
	  abc.roll_No=95;
	  System.out.println("Roll No : " +abc.roll_No);
	  abc.age=31;
	  System.out.println("Age : " +abc.age);
	  abc.display1();
	  abc.display2();
   }	

}
