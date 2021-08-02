public class JavaRecursionExample	{
	public static void main(String[] args)	{
		int result = sum(10);
		System.out.println(result);

		System.out.println(fibo(4));
		System.out.println(fibo(5));
		System.out.println(fibo(10));
	}

	public static int sum(int k)	{
		if (k > 0)	{
			return k + sum(k-1);
		}	else	{
			return 0;
		}
	}

	public static int fibo(int n)	{
		
		int result = 0;

		if (n==0)	{
			return 0;
		} else if (n<=2)	{
			return 1;
		} else	{
			result = fibo(n-1)+fibo(n-2);
			return result;
		}

	}

}
