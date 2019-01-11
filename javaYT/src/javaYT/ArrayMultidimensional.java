package javaYT;

import java.util.Random;

public class ArrayMultidimensional {
	
	public static void main (String[] args) {
	/*	
	String [] uma = {"Ricardo", "Sandra", "Beatriz", "Lawrence", "Laura", "Juliana"};
	//uma [0];
	
	// 2 Dimensões
	String [] [] duas = {{"Ricardo", "M", "DF"},{"Sandra", "F", "MG"},{ "Beatriz", "F", "DF"},{"Lawrence", "M", "PA"},{"Laura", "F", "RJ"},{"Juliana", "F", "SP"}};
	
	duas [1][0] = "SANDRA";
	
	System.out.println(duas[0].length);
	System.out.println(duas.length);
	System.out.println(duas [0][0]); // Ricardo
	System.out.println(duas [1][0]); // Sandra
	*/		
		
	
	String [] faces = { "As","2","3","4","5","6","7","8","9","10","Valete","Dama","King"};
	String [] nipes = { "Espada","Paus","Copas","Ouro"};
	
	
	
	Random r = new Random();
	
	int indiceFace = r.nextInt(faces.length);
	String face = faces[indiceFace];
	
	int indiceNipe = r.nextInt(nipes.length);
	String nipe = nipes[indiceNipe];
	
	
	
	
	String carta = face + " de "+ nipe;	
	System.out.println(carta);
	}
	
}
