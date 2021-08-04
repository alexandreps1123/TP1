public class Carro	{
	String cor;
	String modelo;
	float peso;
	
	// constructor sem parametros
	/*
	public Carro()	{
		cor = "Vermelho";
	}
	*/

	// constructor com e sem parametros
	public Carro(String modelo, float peso)	{
		cor = "Vermelho";
		/*
		* Como que os parametros do construtor tem nomes iguas aos atributos
		* faz-se necessario usar palavra reservada 'this' para diferenciar
		* o que eh atributo e o que parametro
		* a palavra 'this' indica que eh um atributo
		*/
		this.modelo = modelo;
		this.peso = peso;
	}


}
