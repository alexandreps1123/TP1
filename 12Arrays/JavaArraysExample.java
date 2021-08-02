public class JavaArraysExample	{
	public static void main(String[] args)	{

		int[] vector = {1, 2, 3, 4, 5, 6};
		int j = 0;
		String[] names = {"Alexandre", "Ferreira", "rocha", "pedra"};
		int[][] matriz = {{1, 2, 3}, {6, 5, 4}};

		// print vector
		for (int i = 0; i < vector.length; i++)	{
			System.out.println(vector[i]);
		}

		// print names
		for (String i : names)	{
			names[j] = i.toUpperCase();
			j++;
		}
		System.out.println(names[0] + " " +names[1]);

		// print matriz
		for (int i = 0; i < matriz.length; i++)	{
			for (j = 0; j < matriz[i].length; j++)	{
				System.out.println(matriz[i][j]);
			}
		}
	}
}
