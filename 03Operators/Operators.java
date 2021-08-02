// Java Operators

public class Operators	{
	public static void main(String[] args)	{
		// Arithmetic Operators
		float a, b;
		a = 2f;
		b = 3f;

		float sum = a + b;
		float sub = a + b;
		float multi = a * b;
		float div = a / b;
		float mod = a % b ;		// resto da divisão
		float increment = ++a;
		float decrement = --a;

		System.out.println("soma: " + sum);
		System.out.println("subtracao: " + sub);
		System.out.println("multiplicacao: " + multi);
		System.out.println("divisao: " + div);
		System.out.println("resto: " + mod);
		System.out.println("incremento" + increment);
		System.out.println("decremento" + decrement);
		
		// Assignment operators
		float x = 3f;
		int y = 50;
		boolean z = true;

		System.out.println(x = 4f);
		System.out.println(x += 2f);
		System.out.println(x -= 1f);
		System.out.println(x *= 2f);
		System.out.println(x /= 3f);
		System.out.println(x %= 2f);
		System.out.println(y &= 4);
		System.out.println(y |= 4);
		System.out.println(y ^= 2);
		System.out.println(y >>= 3);
		System.out.println(y <<= 1);

		// Comparison Operators
		int i = 5, j = 10;

		System.out.println(i == j);		// equal to
		System.out.println(i != j);		// not equal
		System.out.println(i > j);		// greater than
		System.out.println(i < j);		// less than
		System.out.println(i >= j);		// greater than or equal to
		System.out.println(i <= j);		// less than or equal to

		// Logical Operators
		System.out.println(i<5 && j<10);	// true if both statements are true
		System.out.println(i<5 || j>4);		// true if one of the statements are true
		System.out.println(!(i<5 && j<10));	// reverse the result
	}
}
