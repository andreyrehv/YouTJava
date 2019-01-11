package javaYT;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySimples {

	public static void main (String[] args) {
		
		// um tipo de array
		/*
		int [] impares = new int [5];
		impares [0] = 1;
		impares [1] = 3;
		impares [2] = 5;
		impares [3] = 7;
		impares [4] = 9;
		*/
		
		
		
		String [] paises = {"Brasil", "Russia", "India", "China"};
		
		System.out.println(Arrays.toString(paises));
		
		
		//pesquisa dentro do Array
		
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		
		//ordenar
		
		Arrays.sort(paises,0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		////////////////////////////////////////
		
		Double [] valores = {12.35 , 3456.3456};
		System.out.println(valores [0].doubleValue());
		
		
	}
}
