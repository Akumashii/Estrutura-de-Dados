package aula20250321;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class luno{
	int matricula;
	String nome;
	
	public luno (int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
}

public class Aluno {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<luno> alunos = new ArrayList<>();
		int matricula;
		String nome;
		luno Tmp;
		for(int i=0; i<3; i++) {
			System.out.println("Matricula");
			matricula = teclado.nextInt();
			teclado.nextLine();//consome a quebra de linha que i nextInt nao faz
			System.out.println("nome: ");
			nome = teclado.nextLine();
			
			//alunos.add(new aluno(matricula, nome));
			Tmp = new luno(matricula, nome);
			alunos.add(Tmp);
		}
		
		for(luno a : alunos) {
			System.out.println(a.matricula+" - "+a.nome);
		}
		teclado.close();
	}

}
