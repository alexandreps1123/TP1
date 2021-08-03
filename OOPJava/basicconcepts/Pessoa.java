public class Pessoa	{
	int idade = 28;
	float altura = 1.72f;
	float massa = 65.5f;
	float imc;

	public float calculoIMC(float massa, float altura)	{
		
		float quadradoAltura = altura*altura;
		float imc = massa/quadradoAltura;
		
		return imc;
	}
}
