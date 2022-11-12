public class Operadores{
	public static void main (String [] args) {
		String nomeCompleto = "Linguagem" + "Java"; //Concatenação

		int a, b;
		a = 5;
		b = 3;
		String result = "";
		
		if (a==b)
			result = "Verdadeiro";
		else
			result = "Falso";

		String resultado = a==b ? "Verdadeiro" : "Falso"; 
		// 1 - Outra forma de fazer o mesmo que a estrutura condicional acima fez mas utilizando operadores ternarios
		// 2 - Lembrando que o primeiro termo 'a == b' sempre tem que ser um resultado booleano
		System.out.println(resultado);
		
		
		int resposta = a==b ? 1 : 0; // É possível fazer o mesmo com outros tipos

		System.out.println(resposta);
		
		
	}
}