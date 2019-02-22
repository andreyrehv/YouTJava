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
	
	double soma (double um, double dois) {
		double soma = um + dois;
		
		return soma;
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
