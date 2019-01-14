package javaYT;

import java.util.ArrayList;
import java.util.Scanner;

public class RepetiçãoWhile {
	
	public static void main (String [] args) {
		
		/*FLUXO DE REPETIÇÃO */
		
		/*While
		int i= 3;
		while(i<2) {
			System.out.println(i);
			i++;
		}
		
		/*Do While
		
		do { 
			System.out.println(i);
			i++;
		}while(i<2);
		
		ArrayList<String> produtos = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Liste seus produtos : Para sair digite FIM");
		
		String produto;
				
		/*.equals é uma comparação de String
		
		while(!"FIM".equals(produto = s.nextLine())) {
			produtos.add(produto);
		}
		
		System.out.println(produtos.toString());		
		*/
		
		/*Desafio Fibonacci*/
		
		int anterior = 0;
		int proximo = 1;
		
		System.out.println(anterior);
		
		while(proximo <50 ) {
		System.out.println(proximo);
		
		
		proximo = proximo + anterior; // proximo numero fibonacci
		anterior = proximo - anterior; // atualizando o numero anterior(soma- anterior)
		}
		
		
	}

}
