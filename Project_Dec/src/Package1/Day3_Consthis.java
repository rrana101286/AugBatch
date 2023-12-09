package Package1;

public class Day3_Consthis 
{
	public Day3_Consthis()
	{
		this(12,13,34);
		System.out.println("Default Constructor ");
	}
	public Day3_Consthis(int a)
	{
		this(2,3,5,6);
		System.out.println("One parameterized Constructor ");
	}
	public Day3_Consthis(int b, int c)
	{
		this(2);
		System.out.println("Two parameterized Constructor ");
	}
	public Day3_Consthis(int d,int e,int f)
	{
		System.out.println("Three parameterized Constructor ");
	}
	public Day3_Consthis(int g,int h,int i,int j)
	{
		this();
		System.out.println("four parameterized Constructor ");
	}
	public static void main(String[] args) 
	{
		Day3_Consthis obj=new Day3_Consthis(12,32);
	}
	

}
