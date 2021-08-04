public class Pessoa	{
	
	// atributos da classe Pessoa
	final int idade;
	float altura;
	float massa;
	float imc;

	// classe Constructor
	public Pessoa()	{
		idade = 25;
		altura = 1.72f;
		massa = 65.5f;
	}

	// metodo da classe Pessoa
	public float calculoIMC(float massa, float altura)	{
		
		float quadradoAltura = altura*altura;
		float imc = massa/quadradoAltura;
		
		return imc;
	}

	// a palavra 'static' indica que o metodo pode ser chamado sem precisar criar um objeto
	static int staticSoma(int x, int y)	{
		return x+y;
	}
}
