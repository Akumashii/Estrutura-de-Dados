package aula20250328;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<>();
		Aluno tmp;
		String nome;
		int matricula = 1;
		String opcao;
		
		while(true) {
			System.out.println("Digite nome:");
			nome = scn.nextLine().toUpperCase();
			tmp = new Aluno(matricula, nome);
			if(alunos.contains(tmp)) {
				System.out.println("Aluno está com email cadastrado");
			}else {
				alunos.add(tmp);
				matricula++;
			}
			System.out.println("Continua? (1 - sim // qualquer teclado - nao)");
			opcao = scn.nextLine();
			if(!opcao.equals("1")) {
				break;
			}
		}
		
		alunos.sort((aluno1, aluno2) -> aluno1.nome.compareTo(aluno2.nome));
		
		System.out.println("Relação Alunos");
		for(Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		scn.close();
	}
	
}

