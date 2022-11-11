public class TiposVariaveis {

	public static void main (String[] args) throws Exception {

		String nome = "Meu nome é Yuri";
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que mudar o tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que mudar o tipo. O tipo long precisa terminar com a letra L no final.
		float pi = 3.14F; // para o tipo float, é necessário terminar com a letra 'f', caso contrário o Java pode achar que é do tipo double. 
		double salario = 1275.33;


		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal; // Isso é necessário pois o tipo int é maior que o tipo short, por isso quando você atribui um inteiro para um short ele pode não comportar o valor do inteiro. Para isso, é necessário converter o inteiro para short. Isso se chama CAST.


		final double VALOR_DE_PI = 3.14;
		// 1 - Por convenção, as constantes são escritas em letras maiúsculas
		// 2 - Para declarar uma constante, é necessário adicionar a palavra reservada 'final' no inicio da declaração. Caso contrário, ela não será uma constante

		System.out.print(VALOR_DE_PI);
		
	} 
}