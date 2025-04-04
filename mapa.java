package aula20250314;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapa {

	public static void main(String[] args) {
		ArrayList<String> projetoBancoDados = new ArrayList<>();
		ArrayList<String> estruturaDados = new ArrayList<>();
		ArrayList<String> orientacaoObjetos = new ArrayList<>();
		ArrayList<String> comunicacaoDados = new ArrayList<>();
		ArrayList<ArrayList> cienciaComputacao = new ArrayList<>(); //nao existe ordem de uma lista de lista (sort())
	
		projetoBancoDados.add("Frazzon");
		projetoBancoDados.add("Luiza");
		projetoBancoDados.add("João");
		projetoBancoDados.sort(null);
		cienciaComputacao.add(projetoBancoDados);
		
		estruturaDados.add("Luiza");
		estruturaDados.add("Vanessa");
		estruturaDados.add("Eric");
		cienciaComputacao.add(estruturaDados);
		
		orientacaoObjetos.add("Vanessa");
		orientacaoObjetos.add("Frazzon");
		orientacaoObjetos.add("Luiza");
		orientacaoObjetos.add("Eric");
		orientacaoObjetos.add("Bernardo");

		cienciaComputacao.add(orientacaoObjetos);
		
		comunicacaoDados.add("Bernardo");
		comunicacaoDados.add("Maria");
		cienciaComputacao.add(comunicacaoDados);		
		
		//exibir por disciplina
		System.out.println("disciplinas");
		for (ArrayList disciplina : cienciaComputacao) {
			System.out.println(disciplina);
		}
		System.out.println("--------------------------------");
		//exibir por alunos da disciplina
		System.out.println("alunos por disciplina");
		for (ArrayList disciplina : cienciaComputacao) {
			for (Object aluno : disciplina) {
				System.out.println(aluno);
			}
		}
		System.out.println("--------------------------------");
		//contando quantos alunos fazem quantas disciplinas
		System.out.println("quantas disciplinas cada aluno faz");
		ArrayList<String> alunosDisciplina = new ArrayList<>();
		String nome;
		int contador;
		for (ArrayList disciplina : cienciaComputacao) {
			for (Object aluno : disciplina) {
				nome = aluno.toString();
				if(!alunosDisciplina.contains(nome)) {
					alunosDisciplina.add(nome);
					contador = 0;
					for(ArrayList d : cienciaComputacao) {
						for(Object a : d) {
							if(nome.equals(a.toString())) {
								contador++;
							}
						}
					}
					System.out.println(" - "+nome+" aparece em "+contador+" disciplinas");
				}
			}
		}
	}
}
