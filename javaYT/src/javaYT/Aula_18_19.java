package javaYT;

import java.util.Scanner;

public class Aula_18_19 {
	public static void main (String[]args) {
		// if e else
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String nome = input.nextLine();
		
		System.out.println("Qual sua idade?");
		int idade = input.nextInt();
		
		//condição entre parenteses
		if(idade<1) {
			System.out.println("Idade invalida");
		}else if(idade < 18){
			System.out.println(nome + " você é menor de idade");
		}else{
			System.out.println(nome + " você é maior de idade");
		}
		
		
	}

}
