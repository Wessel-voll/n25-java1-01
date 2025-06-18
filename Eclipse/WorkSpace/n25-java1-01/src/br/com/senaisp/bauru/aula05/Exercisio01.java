package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exercisio01 {

	public static void main(String[] args) {
		//Usando o scanner para ler um arquivo texto
		Scanner sc = new Scanner(Exercisio01.class.getResourceAsStream("arquivo.txt"));
		String linha = sc.nextLine(); //pegando cabeçalho
		Scanner sca = new Scanner(linha);
		sca.useDelimiter(";");
		//Imprimindo o cabeçalho
		while(sca.hasNext()) {
			System.out.print(sca.next() + "\t\t");  // \t = tab
		}
		System.out.println(); // pulando a linha
		sca.close(); //fechando scanner de apoio
		while(sc.hasNextLine()) {
			linha = sc.nextLine();
			sca = new Scanner(linha);
			sca.useDelimiter(";");
			
		}
	}

}
