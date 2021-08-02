public class JavaBreakContinueExample	{
	public static void main(String[] args)	{
		int i = 0;
		for (i = 0; i < 10; i++)	{
			if (i == 4)	{
				break;
			}
		}
		System.out.println(i);

		while(i < 10)	{
			if (i == 4)	{
				System.out.println(i);
				i++;
				continue;
			}	else	{
				System.out.println(i);
				break;
			}
		}
	}
}
