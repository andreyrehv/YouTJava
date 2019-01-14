package javaYT;

import java.util.Random;
import java.util.Scanner;

public class Desafio {
	
	public static void main (String [] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Qual o seu palpite?");
		
		int palpite = s.nextInt();
		
		Random n = new Random();
		
		int dado = n.nextInt(6)+1; // 0 até 5
		
		System.out.println("Palpite = "+ palpite);
		System.out.println("Dado = "+ dado);
		
		
		if(palpite == dado) {
			System.out.println("Você acertou");
		}else {
			System.out.println("ERROU");
		}
		
		
	}

}
