package Package1;

public class Day2_Arithmetic1 
{
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("Mult result is " +c);
		return c;
	}
	public int sum(int a1,int b1)
	{
		int c1;
		c1=a1+b1;
		System.out.println("Sum result is " +c1);
		return c1;
	}
	public int sub(int a2,int b2)
	{
		int c2;
		c2=a2-b2;
		System.out.println("Sub result is " +c2);
		return c2;
	}
	public void div(int a3,int b3)
	{
		int c3;
		c3=a3/b3;
		System.out.println("Final result of (10*2)+2)+2)-2)/2) :  " +c3);
	}
	
	public static void main(String[] args) 
	{
		Day2_Arithmetic1 obj=new Day2_Arithmetic1();
		int multiResult=obj.mul(10, 2);
		int sumResult=obj.sum(multiResult, 2);
		int sumResult2=obj.sum(sumResult, 2);
		int subResult=obj.sub(sumResult2, 2);
		obj.div(subResult, 2);
	}
	
}
