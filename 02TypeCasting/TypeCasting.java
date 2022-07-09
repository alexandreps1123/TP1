public class TypeCasting	{
	public static void main(String[] args)	{
		// Example: Widening Casting
		int myInt = 9;
		double myDouble = myInt;

		System.out.println(myDouble);
		System.out.println(myInt);

		// Exampple: Narrowing Casting
		double otherDouble = 9.78d;
		int otherInt = (int) otherDouble;

		System.out.println(otherDouble);
		System.out.println(otherInt);
	}
}
