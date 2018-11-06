package javaYT;

import java.util.Scanner;

public class Aula_11 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double base, altura, areaRet;
		
		System.out.println("Informe o valor da base");
		base = input.nextDouble();
		
		System.out.println("Informa a altura");
		altura = input.nextDouble();
		
		areaRet = base*altura;
		
		System.out.println("A area do retangulo é: " + areaRet + " m2.");
	}
}
