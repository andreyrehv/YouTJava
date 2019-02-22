package ytJava;

public class MatematicaTeste {
	
	public static void main(String[] args) {
		
		Matematica mat = new Matematica();
		int ma = mat.maior(10,20);
		System.out.println(ma);
		
		double so = mat.soma(10, 20);
		System.out.println(so);
		
		//int par = mat.maior(2, 4);
		//int impar = mat.maior(3, 5);
		//double soma = mat.soma(par, impar);
		double soma = mat.soma(mat.maior(2, 4), mat.maior(3, 5));
		System.out.println(soma);
		
		int raiz = mat.raiz(276);
		System.out.println(raiz);
		
	}

}
