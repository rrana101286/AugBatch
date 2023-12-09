package Package1;

public class Day3_Meththis 
{
   public void first()
   {
	 System.out.println("Default Method ");
   }
   public void Second(int a)
   {
	 System.out.println("One parameterized Method ");
   }
   public void Third(int b,int c)
   {
	   this.four(2,3,3);
	   this.five(3,4,5,6);
	   this.first();
	   this.Second(2);
  	 System.out.println("Two parameterized Method ");
   }
   public void four(int d,int e, int f)
   {
  	 System.out.println("three parameterized Method ");
   }
   public void five(int g,int h, int i,int j)
   {
  	 System.out.println("four parameterized Method ");
   }
   public static void main(String[] args) 
   {
	   Day3_Meththis obj=new Day3_Meththis();
			   obj.Third(2, 3);
   }
}
