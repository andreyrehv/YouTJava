package javaYT;

import java.util.Scanner;

public class Aula_14 {
	public static void main (String[]args) {
		
		//% operador que define o resto da divis�o
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o valor em gramas");
		int gramas = input.nextInt();
		
		int kilos = gramas/1000;
		
		gramas= gramas % 1000;
		
		
		
		System.out.println("O total de kilos �= " + kilos);
		System.out.println("O total de gramas �= " + gramas);
		
		
		
	}

}
