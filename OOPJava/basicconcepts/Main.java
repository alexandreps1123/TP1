public class Main	{
	public static void main(String[] args)	{
		Pessoa eu = new Pessoa();
		
		System.out.println(eu.idade);
		eu.imc = eu.calculoIMC(eu.massa, eu.altura);

		System.out.println(eu.imc);
	}
}
