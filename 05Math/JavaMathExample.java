public class JavaMathExample	{
	public static void main(String[] args)	{
		
		System.out.println("Max: " + Math.max(5,10));
		System.out.println("Min: " + Math.min(5,10));
		System.out.println("Square root: " + Math.sqrt(64));
		System.out.println("Absolute value: " + Math.abs(-4.5));

		int randomNum = (int) (Math.random()*101);	// 0 to 100
		
		System.out.println("Random: " + randomNum);
		
	}
}
