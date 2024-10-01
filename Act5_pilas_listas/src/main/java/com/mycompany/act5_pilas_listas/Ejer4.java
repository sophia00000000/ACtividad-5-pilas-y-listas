package com.mycompany.act5_pilas_listas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Ejer4 {
	public static ArrayList<Stack<Stack<String>>> bodega = new ArrayList();
	
	public static void ejecutar(){
		llenarBodega();
		mostrarBodega();
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código del contenedor a eliminar: ");
        String codigo = scanner.nextLine();
        
        sacarContenedor(codigo, 0, 0, 0); // Inicia desde la fila 0, columna 0

	}
	
	public static void llenarBodega() {
	// Arreglo principal de 9 pilas
	int cantidadFilas=9; //9 pilas
	int cantidadPilasPorFila=7; //7 pilas en cada una de las 9 filas
	int cantidadPorPila=8; // alto de cada pila
	
		for (int i = 0; i < cantidadFilas; i++) {
            Stack< Stack<String> > pilaFila = new Stack<>();
            
            for (int j = 0; j < cantidadPilasPorFila; j++) {
            	Stack<String> pila = new Stack<>();
            	
            	for (int k = 0; k < cantidadPorPila; k++) {
            		Random random = new Random();
      	
            		pila.push((char) ('A' + random.nextInt(26)) + String.format("%04d", random.nextInt(10000)));
            	}
            	pilaFila.push(pila);
            }          
            bodega.add(pilaFila);
		}

	}
	
	public static void mostrarBodega() {
        for (int i = 0; i < bodega.size(); i++) {
            System.out.println("Fila " + (i + 1) + ":");
            Stack<Stack<String>> fila = bodega.get(i); // Devuelve una pila de pilas
            
            for (int j = 0; j < fila.size(); j++) {
                Stack<String> pila = fila.get(j);
                System.out.println("  Pila " + (j + 1) + ": " + pila);
            }
        }   
    }
	


    public static boolean sacarContenedor(String codigo, int filaIndex, int columnaIndex, int posicion) {
        // Caso base
        if (filaIndex >= bodega.size()) {
            return false; // Contenedor no encontrado
        }

        Stack<Stack<String>> fila = bodega.get(filaIndex);
        
        // Caso base
        if (columnaIndex >= fila.size()) {
            return sacarContenedor(codigo, filaIndex + 1, 0, 0); // Pasa a la siguiente fila
        }

        Stack<String> pila = fila.get(columnaIndex);

        // Caso recursivo Si la pila está vacía, pasa a la siguiente columna
        if (pila.isEmpty()) {
            return sacarContenedor(codigo, filaIndex, columnaIndex + 1, 0);
        }

        String tope = pila.pop(); 

        //caso recursivo
        if (tope.equals(codigo)) {
            System.out.println("Contenedor " + codigo + " eliminado de: Fila " + (filaIndex + 1) + ", Columna " + (columnaIndex + 1) + ", Posición " + (posicion + 1));
            return true;
        } else {
            boolean encontrado = sacarContenedor(codigo, filaIndex, columnaIndex, posicion + 1); 
            pila.push(tope);
            return encontrado;
        }
    }

}

