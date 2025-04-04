package aula20250321;

import java.util.Scanner;

public class NomeCompleto {

	public static void main(String[] args) {
		String nomeCompleto;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nome Completo:");
		nomeCompleto = teclado.nextLine().toUpperCase();
		
		String vetorNome[];
		vetorNome = nomeCompleto.split(" ");
		for(int i = 0; i<vetorNome.length; i++) {
			System.out.println(vetorNome[i]); //isso nao é uma lista pois tive que exibir o vetor por indice 
		}
		
		String email = vetorNome[0] + "." + vetorNome[vetorNome.length-1] + "@ufn.edu.br";
		email = email.toLowerCase();

		
		System.out.println(nomeCompleto);
		System.out.println(email);

		teclado.close();
	}

}
