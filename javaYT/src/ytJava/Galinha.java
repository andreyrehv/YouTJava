package ytJava;

public class Galinha {
	
	public static int ovosDaGranja; //variavel global
	
	public int ovos; // total de ovos do objeto galinha

	public Galinha colocar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
	}
}
