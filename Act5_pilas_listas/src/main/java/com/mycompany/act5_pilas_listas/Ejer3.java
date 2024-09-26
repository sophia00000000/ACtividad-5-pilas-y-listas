package com.mycompany.act5_pilas_listas;

import java.util.ArrayList;
import java.util.Stack;

public class Ejer3 {
	public static Stack<Integer> establo2= new Stack();
	public static Stack<Integer> establo3 = new Stack();
	public static ArrayList<Integer> establo1 = new ArrayList();

	
	public static void ejecutar(){
		llenarLista();
		separarNovillos();
		System.out.println("Establo 1: "+establo1.toString());
		promedios();
	}

	public static void llenarLista() {
		int i=0;
		while(i<establo1.size()){
			establo1.add((int)(Math.random() * 501) + 50);
			i++;
		}
		System.out.println(establo1.toString());
	}
	
	public static void separarNovillos() {
		int i=0;
		while(i<establo1.size()){
			if(200 <= establo1.get(i) && establo1.get(i)<= 350 ) {
				establo2.add(establo1.get(i));
				establo1.remove(i);
			}
			else {
				if(351<= establo1.get(i) && establo1.get(i)<=450) {
					establo3.add(establo1.get(i));
					establo1.remove(i);
				}
			}
			i++;
		}
	}
	
	
	public static void promedios() {
		int suma=0; 
		for(int i=0; i<establo1.size(); i++) {
			suma=+ establo1.get(i);
		}
		double promedioLista= suma /establo1.size();
		System.out.println("Promedio pesos establo 1: " +promedioLista);
		System.out.println("Numero de animales: "+establo1.size());
		
		suma=0;
		int tam= establo2.size();
		while(!establo2.isEmpty()) {
			suma=+ establo2.pop();
		}
		
		double promedioEstablo2= suma /tam;
		System.out.println("Promedio pesos establo 2: " +promedioEstablo2);
		System.out.println("Numero de animales: "+tam);
		
		
		suma=0;
		int tam3= establo3.size();
		while(!establo3.isEmpty()) {
			suma=+ establo3.pop();
		}
		
		double promedioEstablo3= suma /tam;
		System.out.println("Promedio pesos establo 3: " +promedioEstablo3);
		System.out.println("Numero de animales: "+tam3);
		

		
	}
	
	
}