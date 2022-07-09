public class JavaMethodsExample	{
	static void myMethod()	{
		System.out.println("Method Executed!");
	}

	static int sum(int num1, int num2)	{
		return num1+num2;
	}

	public static void main(String[] args)	{
		myMethod();
		myMethod();

		int soma = sum(5,4);
		System.out.println(soma);
	}
}
