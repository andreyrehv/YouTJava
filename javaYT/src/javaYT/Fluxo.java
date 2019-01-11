package javaYT;

public class Fluxo {
	
	public static void main (String[] args) {
		
		int idade = 67;
		
		if(idade <= 11) {
			System.out.println("Criança");
		}else if (idade > 12 && idade <= 18 ){
			System.out.println("Adolescente");
		}else if (idade > 19 && idade <= 60){
			System.out.println("Adulto");
		}else { System.out.println("Idoso");
		}
		
		
		/*int numero = 11;
		
		if ((numero % 2) == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		*/
		
	}

}
