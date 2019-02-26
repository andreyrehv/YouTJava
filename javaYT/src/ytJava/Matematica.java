package ytJava;

public class Matematica {
	
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return maior dos dois numeros
	 */
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		}else {		
		return dois;
	}
	}
	
	//double soma (double um, double dois) {
	//	double soma = um + dois;
	
	// Para numeros indefinidos de argumentos	
	double soma(String titulo, double ... numeros) { 
		System.out.println(titulo);
		double total =0;
		for(double n : numeros) {
			total +=n;
		}
		return total;
	
	}
	
	// para array
	double som (double[] numeros) {
		double totali = 0;
		for(double n: numeros) {
			totali += n;
		}
		return totali;
	}
	
	/**
	 * 
	 * @param numero
	 * @return a raiz quadrada segundo a equação de pell
	 */
	int raiz (int numero) {
		int raiz = 0, impar = 1;
		while(numero >= impar) {
			numero -= impar;
			impar += 2; //proximo numero impar
			++raiz;
		}
		
		return raiz;
	}
	
	

}
