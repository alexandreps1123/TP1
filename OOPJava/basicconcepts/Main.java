public class Main	{
	public static void main(String[] args)	{
		// 'new' cria um novo objeto
		// instancia a classe
		Pessoa eu = new Pessoa();
		Pessoa tu = new Pessoa();		
		Carro fusca = new Carro("fusquinha", 1025.63f);	
		/*
		* o atributo idade esta definida com a palavra final
		* significa que nao pode ser atribuido um valor a esse atributo
		* durante a chamada do objeto.
		
		eu.idade = 10;
		*/
		System.out.println("idade eu: "+eu.idade);
		System.out.println("idade tu: "+tu.idade);

		// chamada do metodo 'calculoIMC' da classe Pessoa
		// o atributo 'imc' recebe o retorno do metodo 'calculoIMC'
		eu.imc = eu.calculoIMC(eu.massa, eu.altura);

		// metodo 'static' nao necessita que um objeto seja criado para utiliza-la
		// basta invocar o nome da classe: Pessoa e o metodo 'static'
		System.out.println("staticSoma: "+Pessoa.staticSoma(1, 3));

		System.out.println(eu.imc);

		System.out.println("Cor: "+fusca.cor+" Modelo: "+fusca.modelo+" Peso: "+fusca.peso);
	}
}
