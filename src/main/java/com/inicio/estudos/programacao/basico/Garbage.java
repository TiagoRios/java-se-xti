package com.inicio.estudos.programacao.basico;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	//metodo que sobrecarrega a memoria
	public static long sobreCarregarMemoria(){
		List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 100_000; i++) {
				list.add(i);	
			}
			return Runtime.getRuntime().freeMemory();
	}
	
	public static void main(String[] args) {
		
		//recuperar informa��es.
		Runtime runtime = Runtime.getRuntime();
		int  mebabyte = 1048576;//total de bytes 
		//para retorna o valor da memoria em MB divide o numero total por bytes.
		double total = runtime.maxMemory()/mebabyte;//retorna a quantidade de memoria
		
		double inicio = total - (sobreCarregarMemoria()/mebabyte);
		
		runtime.runFinalization();
		runtime.gc();//for�a a execu��o do Garbage collection
		
		double fim = total - (runtime.freeMemory()/mebabyte);
	
		System.out.println("total de MB "+total);
		System.out.println("inicio em MB "+inicio);
		System.out.println("fim em MB "+fim);	
	}
}
