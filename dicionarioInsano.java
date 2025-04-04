package aula20250314;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dicionarioInsano {

	public static void main(String[] args) {
		List<Map<String, String>> listaDeDicionario = new ArrayList<>();
		
		
		Map<String, String> dicionario1 = new HashMap<>();
		Map<String, String> dicionario2 = new HashMap<>();
		//dicionario.put(key: xxx, value: xxx);
		dicionario1.put("nome", "joão");
		dicionario2.put("idade", "25");
		
		listaDeDicionario.add(dicionario1);
		listaDeDicionario.add(dicionario2);
		
		for(Map<String, String> dicionario : listaDeDicionario) {
			System.out.println("Nome: "+dicionario.get("nome"));
			System.out.println("Idade: "+dicionario.get("idade"));
			System.out.println("------------------------");
		}
	}

}
