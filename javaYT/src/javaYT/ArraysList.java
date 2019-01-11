package javaYT;

import java.awt.List;
import java.util.ArrayList;


public class ArraysList {
	
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add(0, "Vermelho");
		cores.add("Amarelo");
		cores.add("Azul");
		
		
		
		System.out.println(cores.toString());
		
		System.out.println("Tamanho=" + cores.size());
		System.out.println("Elemento 2 = " + cores.get(2));
		System.out.println("Indice Branco = " + cores.indexOf("Branco"));
		
		
		// remover
		cores.remove("Branco");
		
		
		// Verificar se um elemento existe dentro do ArrayList
		cores.contains("Amarelo");
		
		
		
		System.out.println("Tem Amarelo? " + cores.contains("Amarelo"));
		System.out.println("Tem Cinza? " + cores.contains("Cinza"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
