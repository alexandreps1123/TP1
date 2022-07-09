// Java data types

public class Types	{
	public static void main(String[] args)	{
		byte myByte = 100;
		short myShort = 5000;
		int myNum = 28;				// Integer (whole number)
		long myLong = 1500000000L;

		int otherNum;
		otherNum = 14;

		float myFloatNum = 5.99f;	// Floating point number
		double myDouble = 4.99d;

		char myLetter = 'A';		// Character
		String name = "Alexandre";	// It's not a primitive Type

		boolean myBool = true;		// Boolean
		
		int sum = myNum + otherNum;

		System.out.println("SUM: " + sum);
		System.out.println("Byte: " + myByte);
		System.out.println("Short: " + myShort);
		System.out.println("Int: "+ myNum);
		System.out.println("Long: " + myLong);
		System.out.println("Float: " + myFloatNum);
		System.out.println("Double: " + myDouble);
		System.out.println("Char: " + myLetter);
		System.out.println("String: " + name);
		System.out.println("Boolean: " + myBool);
	}
}
