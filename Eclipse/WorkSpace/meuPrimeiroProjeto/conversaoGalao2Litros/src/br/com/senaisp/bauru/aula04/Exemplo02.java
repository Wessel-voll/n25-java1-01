package br.com.senaisp.bauru.aula04;

public class Exemplo02 {

	public static void main(String[] args) {
		String str01 = "Roberto da Silva Sauro";
		//Verificar se há dino no texto
		System.out.println(str01.contains("da"));		
		//Obter a posição no texto de um subtexto
		System.out.println(str01.indexOf("o",3));
		System.out.println(str01.indexOf("o",7));
		//Nesse caso o número a seguir é a partir de uma posição especifica do texto
		//Obter o caracter na posição desejada
		System.out.println(str01.charAt(3));
		//Obtendo substring de uma string sem limitar o final
		System.out.println(str01.substring(8));
		//Obtendo substring de uma string limitando o final (Posições)
		System.out.println(str01.substring(8,16));
		//Usando o compareTo
		System.out.println(str01.compareTo("Roberta"));
	}

}
