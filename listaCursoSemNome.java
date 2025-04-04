package aula20250314;

import java.util.ArrayList;

public class listaCursoSemNome {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> cienciaComputacao = new ArrayList<>();
		//0 - estrutura de dados
		cienciaComputacao.add(new ArrayList<String>());
		//1 - banco de dados
		cienciaComputacao.add(new ArrayList<String>());
		//2 - ia
		cienciaComputacao.add(new ArrayList<String>());
		
		cienciaComputacao.get(0).add("Luiza");
		cienciaComputacao.get(0).add("Eric");
		cienciaComputacao.get(0).add("Vanessa");
		cienciaComputacao.get(0).add("Frazzon");
		cienciaComputacao.get(0).sort(null);
		
		cienciaComputacao.get(1).add("Luiza");
		cienciaComputacao.get(1).add("Vanessa");
		cienciaComputacao.get(1).add("Frazzon");
		cienciaComputacao.get(1).sort(null);
		
		cienciaComputacao.get(2).add("Luiza");
		cienciaComputacao.get(2).add("Eric");
		cienciaComputacao.get(2).sort(null);
	
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
