/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act5_pilas_listas;

import java.util.Stack;

/**
 *
 * @author laura
 */
public class Ejer1 {
    public static Stack<Integer> pila = new Stack();
    public static Stack<Integer> pilaAux = new Stack();
    
    public static void llenarPila(){
        int dato=900;
        for(int i=0; i<10;i++){
            pila.push(dato);
            dato-=20;
        }
        System.out.println(pila.toString());
    }
    
    
    public static void ejecutar(){
        llenarPila();
        int primero=pila.pop();
        
        while(!pila.isEmpty()){
            pilaAux.push(pila.pop());
        }
        int ultimo =pilaAux.pop();
        System.out.println(pila.toString());
        System.out.println(pilaAux.toString());
        
        pila.push(primero);
        while(!pilaAux.isEmpty()){
            pila.push(pilaAux.pop());
        }
        pila.push(ultimo);
        System.out.println(pila.toString());
            
    }
}
