package listaInteger;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class ListaInteger {
    public static void main(String[] args){
        //codigo que popula uma lista com n numeros inteiros aleatorios
        ArrayList<Integer> lista = new ArrayList<>();  
        
        Random gerador = new Random();
        int tamanho = gerador.nextInt(10, 20); //de 10 (pois especifiquei a origem) até aquele número
        int numero;

        //inserir
        for (int i=0; i<tamanho; i++){
            numero = gerador.nextInt(1000); // de 0 (não especifiquei a origem) até aquele número
            if(!lista.contains(numero)){ //controla duplicados
                lista.add(numero);
            }    
        }
        
        //ordernar
        lista.sort(null);

        //exibir
        System.out.println("Exibindo por indices...");
        for (int i=0; i<lista.size(); i++){
           System.out.println(lista.get(i)); 
        }

        System.out.println("Exibindo por objetos...");
        for (Integer i : lista) {
            System.out.println(i); 
        }

        System.out.println("Lista de inteiros usando Iterador..."); //melhor opcao para manusear depois aparentemente
        Iterator<Integer> iterator = lista.iterator();
        while(iterator.hasNext()){
            numero = iterator.next();
            System.out.println(numero);
        }

        //se eu quiser remover um numero por exemplo um bom jeito é assim:
        if(lista.remove(Integer.valueOf(15))){ //vou remover o 15, tmb estou convertendo o 15 (int) para 15 (integer)
            /*
            interessante que o if esta removendo o numero
            e esta retornando um boolean, assim valida meu if else
            otimizando minha performance
            */
            System.out.println("numero localizado removido");
        } else {
            System.out.println("numero nao localizado");
        }

        //percorrer via indice
        for(int i=0; i<lista.size(); i++) {
            if(lista.get(i) % 2 != 0){ //se o numero é impar
                lista.set(i,-1); //eu substituo por -1
            }
        }
        /*
         * sujestao do professor é nao usar o indice 
         * aparentemente é melhor usar via objeto, mas deu erro de sintaxe na hora de mostrar
         * aparentemente usar via indice é ultrapassado
         */
        System.out.println("Exibindo por objetos...");
        for (Integer i : lista) {
            System.out.println(i); 
        }
    }
}
