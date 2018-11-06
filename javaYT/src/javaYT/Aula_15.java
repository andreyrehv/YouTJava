package javaYT;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Aula_15 {
	public static void main(String[]args) {
		
		//
		long totalMilisegundos = System.currentTimeMillis();
		
		
		long totalSegundos = totalMilisegundos/1000;
		long segundoAtual = totalSegundos % 60;
		
		long totalMinutos = totalSegundos/60;
		long minutoAtual = totalMinutos % 60;
		
		long totalHora = totalMinutos/60;
		long horaAtual = totalHora % 24;
		
		System.out.println(horaAtual +":"+ minutoAtual + ":" + segundoAtual);
		
	}

}
