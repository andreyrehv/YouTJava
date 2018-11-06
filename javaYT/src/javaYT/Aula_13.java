package javaYT;

import java.util.Scanner;

public class Aula_13 {
	public static void main (String[] args) {
		
		//final para determinar uma variavel constante
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do raio");
		double raio = input.nextDouble();
		
		
		double area = raio * raio * PI;
		
		
		
		
		System.out.println("O valor da area é= "+area);
	}

}
