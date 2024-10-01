package com.mycompany.act5_pilas_listas;
import java.util.Date;

public class Producto {
    private int numeroPedido;
    private Date fecha;
    private int codigo;
    private int cantidad;
    private double precio;

    public Producto(int numeroPedido, Date fecha, int codigo, int cantidad, double precio) {
        this.numeroPedido = numeroPedido;
        this.fecha = fecha;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getCodigoProducto() {
        return codigo;
    }

    public int getCantidadPedida() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "numeroPedido=" + numeroPedido +
                ", fecha=" + fecha +
                ", codigoProducto='" + codigo + '\'' +
                ", cantidadPedida=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
