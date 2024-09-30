package com.mycompany.act5_pilas_listas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Ejer4 {
	public static ArrayList<Stack<Stack<String>>> bodega = new ArrayList();
	
	public static void ejecutar(){
		llenarBodega();
		mostrarBodega();
		sacarContenedor( ejm );
	}
	
	public static void llenarBodega() {
	// Arreglo principal de 9 pilas
	int cantidadFilas=9; //9 pilas
	int cantidadPilasPorFila=7; //7 pilas en cada una de las 9 filas
	int cantidadPorPila=8; // alto de cada pila
	
		for (int i = 0; i < cantidadFilas; i++) {
            Stack< Stack<String> > pilaFila = new Stack<>();
            
            for (int j = 0; j < cantidadPorPila; j++) {
            	Stack<String> pila = new Stack<>();
            	
            	for (int k = 0; k < cantidadPorPila; j++) {
            		Random random = new Random();
      	
            		pila.push((char) ('A' + random.nextInt(26)) + String.format("%04d", random.nextInt(10000)));
            	}
            	pilaFila.push(pila);
            }          
            bodega.add(pilaFila);
		}

	}
	public static void sacarContenedor(String codigo) {
		
	}
}
