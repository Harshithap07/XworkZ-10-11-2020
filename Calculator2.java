class Calculator2
{
	public static void add(int a, int b)
	{
		int sum=0;
		sum=a+b;
		System.out.println(" The Sum is = " +sum);
	}
	public static void subtract(int a, int b)
	{
		int sub=0;
		sub=a-b;
		System.out.println(" The Subtraction is = " +sub);
	}
	public static void multiply(int a, int b)
	{
		int multi=0;
		multi=a*b;
		System.out.println(" The Multiplication is = " +multi);
	}
	public static void division(int a, int b)
	{
		int div=0;
		div=a/b;
		System.out.println(" The Division is = " +div);
	}
	public static void main(String args[])
	{
		int x=20;
		int y=70;
		Calculator2.add(x,y);
		Calculator2.subtract(x,y);
		Calculator2.multiply(x,y);
		Calculator2.division(x,y);
	}
} 