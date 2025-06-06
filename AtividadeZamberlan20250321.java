package aula20250321;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class GeradorEmail{
	
	public String geradorEmail(String nome) {
		String vetorNome[];
		vetorNome = nome.split(" ");
		String email = vetorNome[0] + "." + vetorNome[vetorNome.length-1] + "@ufn.edu.br";
		email = email.toLowerCase();	
		//preciso fazer a verificação do email antes de retornar o email
		return email;
	}
	
	public boolean verificadorEmail(String email, List<Pessoa> pessoas) {
		for (Pessoa p : pessoas) {
            if (p.email.equals(email)) {
                return true; 
            }
        }
        return false; 
	}
}

class Pessoa{
	String nome;
	String email;
	
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
}

public class AtividadeZamberlan20250321 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		GeradorEmail emailM = new GeradorEmail();
		//variaveis locais
		String nome;
		String geradorEmail;

		int op = 1;
		
		//do para fazer registro dos emails, ele deve: GERAR, VERIFICAR_DUPLICATA, ARMAZENAR.
		do {
			System.out.println("Nome:");
			nome = teclado.nextLine().toUpperCase();
			
			//chamo o metodo geradorEmail para.. bem, gerar email
			geradorEmail = emailM.geradorEmail(nome).toLowerCase();
			
			//antes de adicionar preciso verificar se já existe o email
			int i=0;
			while (emailM.verificadorEmail(geradorEmail, pessoas)) {
				if(i==0)
					System.out.println("E-mail já existe! Adicionando um número...");
                geradorEmail = geradorEmail.replace("@ufn.edu.br", i + "@ufn.edu.br"); //isso aqui nao saiu conforme esperado, ficou ridiculo. Serve pro exercicio
                i++;
            }

            // Criar e armazenar a pessoa
            pessoas.add(new Pessoa(nome, geradorEmail));
            System.out.println("E-mail gerado: " + geradorEmail);

			System.out.println("Continuar? (1 - sim / 0 - não): ");
			op = teclado.nextInt();
			teclado.nextLine(); //para limpar o \n que o nextInt nao pega
		}while(op==1); 
		
		//exibir na tela todas as pessoas registradas
		for(Pessoa p : pessoas) {
			System.out.println(p.nome+" - "+p.email);
		}
		
		
		teclado.close();
	}
}   
