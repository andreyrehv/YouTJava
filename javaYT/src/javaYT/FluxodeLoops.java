package javaYT;

import java.util.ArrayList;

public class FluxodeLoops {
	public static void main (String [] args) {
		
		int tamanho = 5;
		for(int x=0; x<tamanho; x++) {
			for(int i=0; i<tamanho; i++) {
				System.out.print("+ ");
			}
			System.out.println();
		}

		
		/*for Tradicional */
		ArrayList<Integer> list = new ArrayList<>();		
		for(int i=0; i<10; i++) {
			list.add(i);
			System.out.println(i);
		}
		
		/*foreach */				
		
		for(Integer numero : list) {
			System.out.println(numero);
		}
		
		
		
		
}
}