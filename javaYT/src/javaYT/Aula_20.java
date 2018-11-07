package javaYT;

import java.util.Scanner;

public class Aula_20 {
	public static void main(String[]args) {
		
		//Operadores lógicos
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro");
		int numero = input.nextInt();
			
		//diferente !=
		/*if(numero % 2 != 0){
			System.out.println("IMPAR");
		}	
		*/
		
		// && significa "e"
		// || significa "ou"
		if((numero % 2 == 0) && (numero < 20)) {
			System.out.println("OK");
		}
	}

}
