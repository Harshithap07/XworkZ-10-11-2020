class Calculator1
{
	public static void add()
	{
		int a=30;
		int b=15;
		int sum=0;
		sum=a+b;
		System.out.println("The Sum of two numbers is = " +sum);
	}
	public static void subtract()
	{
		int a=30;
		int b=15;
		int sub=0;
		sub=a-b;
		System.out.println("The Subtraction of two numbers is = " +sub);
	}
	public static void multiply()
	{
		int a=30;
		int b=15;
		int multi=0;
		multi=a*b;
		System.out.println("The Multiplication of two numbers is = " +multi);
	}
	public static void division()
	{
		int a=30;
		int b=15;
		int div=0;
		div=a/b;
		System.out.println("The Division of two numbers is = " +div);
	}
	public static void main(String args[])
	{
		Calculator.add();
		Calculator.subtract();
		Calculator.multiply();
		Calculator.division();
	}
} 