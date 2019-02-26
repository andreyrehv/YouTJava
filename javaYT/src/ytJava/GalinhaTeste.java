package ytJava;

public class GalinhaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Galinha g1 = new Galinha();
		Galinha g2 = new Galinha();
		
		
		g1.colocar().colocar().colocar();
		g2.colocar().colocar();
		//g1.colocar();
		//g1.colocar();
		//g1.colocar();
		
		
		System.out.println(g1.ovos);
		System.out.println(g2.ovos);
		System.out.println(Galinha.ovosDaGranja);
		System.out.println(Galinha.mediaDeOvos(2));

	}

}
