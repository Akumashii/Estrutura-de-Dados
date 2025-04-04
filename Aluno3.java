package listaInteger;

import java.util.ArrayList;

public class Aluno {
	public static void main(String[] args) {
		//pra fazer lista dentro de lista
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		ArrayList<Integer> lista3 = new ArrayList<>();
		ArrayList<Integer> lista4 = new ArrayList<>();
		ArrayList<ArrayList> listaPrincipal = new ArrayList<>();
		
		lista1.add(32);
		lista1.add(320);
		lista1.add(95);
		listaPrincipal.add(lista1);
		
		lista2.add(2);
		lista2.add(999);
		listaPrincipal.add(lista2);
		
		lista3.add(12);
		lista3.add(77);
		lista3.add(95);
		lista3.add(571);
		listaPrincipal.add(lista3);
		
		lista4.add(32);
		lista4.add(320);
		lista4.add(95);
		listaPrincipal.add(lista4);

		for (ArrayList lista : listaPrincipal) {
			for (Object i : lista) {
				if((int)i % 2 == 0) {
					System.out.println(i);
				}                   
			}
		}
		
		
	}
}
