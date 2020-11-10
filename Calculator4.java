class Calculator4
{
	public static int add()
	{
		return 90+30;
	}
	public static int subtract()
	{
		return 90-30;
	}
	public static int multiply()
	{
		return 90*30;
	}
	public static int division()
	{
		return 90/30;
	}
	public static void main(String args[])
	{
		int sum=Calculator4.add();
		System.out.println("The Addition is =" +sum);
		int sub=Calculator4.subtract();
		System.out.println("The Subtraction is =" +sub);
		int multi=Calculator4.multiply();
		System.out.println("The Multiplication is =" +multi);
		int div=Calculator4.division();
		System.out.println("The Division is =" +div);
	}
} 