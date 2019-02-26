package ytJava;

public class MatematicaTeste {
	
	public static void main(String[] args) {
		
		Matematica mat = new Matematica();
		int ma = mat.maior(10,20);
		System.out.println(ma);
		
		
		
		//int par = mat.maior(2, 4);
		//int impar = mat.maior(3, 5);
		//double soma = mat.soma(par, impar);
		//double soma = mat.soma(mat.maior(2, 4), mat.maior(3, 5));
		double total = mat.soma("Numeros somados", 6,7,8,9);
		System.out.println(total);
		
		//Chamando com Array
		double[]numeros = {2,3,4,5,6,7};
		double totali = mat.som(numeros);
		System.out.println(totali);
		
		
		int raiz = mat.raiz(27);
		System.out.println(raiz);
		
		System.out.println(Math.sqrt(27));
		
	}

}
