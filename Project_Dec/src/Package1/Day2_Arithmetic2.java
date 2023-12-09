package Package1;

public class Day2_Arithmetic2 
{
	public int div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("Div result is " +c);
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
	public void mul(int a3,int b3)
	{
		int c3;
		c3=a3*b3;
		System.out.println("Final result of (10/2)-2)+2)-2)*2 :  " +c3);
	}
	public static void main(String[] args) 
	{
		Day2_Arithmetic2 obj=new Day2_Arithmetic2();
		int divResult=obj.div(10, 2);
		int subResult=obj.sub(divResult, 2);
		int sumResult=obj.sum(subResult, 2);
		int subResult1=obj.sub(sumResult, 2);
		obj.mul(subResult1, 2);
		
	}
}
