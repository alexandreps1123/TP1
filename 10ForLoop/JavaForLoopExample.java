public class JavaForLoopExample	{
	public static void main(String[] args)	{
		String[] names = {"alexandre", "ferreira", "juqueira", "rocha", "pedra"};

		for (int i=0; i<10; i++)	{
			System.out.println(i);
		}

		for (String i : names)	{
			System.out.println(i);
		}
	}
}
