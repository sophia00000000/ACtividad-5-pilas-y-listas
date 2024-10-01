package com.mycompany.act5_pilas_listas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Ejer6 {
	
	public static void ejecutar() {
		crearListaDeProductos();
	}
	
	public static void crearListaDeProductos() {
		ArrayList<Producto> listaDeProductos = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) { //10 productos
            int numeroPedido = i + 1000; 
            Date fecha = new Date();
            int codigo = (rand.nextInt(100)); 
            int cantidad = rand.nextInt(10) + 1; 
            double precio = rand.nextDouble() * 100;

            // Crear un nuevo producto y agregarlo a la lista
            Producto producto = new Producto(numeroPedido, fecha, codigo, cantidad, precio);
            listaDeProductos.add(producto);
        }
        // Mostrar 
        for (Producto producto : listaDeProductos) {
            System.out.println(producto);
        }
    }
	
}
