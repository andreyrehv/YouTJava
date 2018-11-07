package javaYT;

import java.util.Scanner;

public class Aula_17 {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		
		//Objeto que permite armazenar um conjunto de objeto
		System.out.println("Qual seu nome");
		String nome = input.next();
		
		System.out.println("Qual seu sobrenome");
		String sobrenome = input.next();
		
		System.out.println("Qual sua idade");
		int idade = input.nextInt();
		
		System.out.println("Ola " + nome +" " + sobrenome + " "+idade + " " + "anos");
	}

}
