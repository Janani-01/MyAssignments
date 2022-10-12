package week1day2;

public class calculator {
	public void AddingTwoNumbers(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void SubtractingTwoNumbers(int e,int f) 
	{
		int c=e-f;
		System.out.println(c);
	}
	public void MultiplyingTwoNumbers(int i,int j)
	{
		int c=i*j;
		System.out.println(c);
	}
	public void DividingTwoNumbers(int x,int y)
	{
		int c=x/y;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		calculator clc=new calculator();
		clc.AddingTwoNumbers(32,13);
		clc.SubtractingTwoNumbers(15,20);
		clc.MultiplyingTwoNumbers(9,10);
		clc.DividingTwoNumbers(12,16);
	}
}
