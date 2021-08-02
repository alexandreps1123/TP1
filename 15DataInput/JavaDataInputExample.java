import java.util.Scanner;

public class JavaDataInputExample	{
	public static void main(String[] args)	{
	Scanner teclado = new Scanner(System.in);

	String name = teclado.nextLine();
	int nota = teclado.nextInt();
//	String name = teclado.nextLine();

//	System.out.println(nota);
	System.out.printf("%s tirou nota %d !", name, nota);

	
	}
}
