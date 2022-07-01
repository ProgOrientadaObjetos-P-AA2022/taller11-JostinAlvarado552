/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author josti
 */
public class Cuenta {

    private String nombreCliente;
    private ArrayList<Menu> listamenu = new ArrayList<>();
    private double valorCancelar;
    private double subtotal;
    private double iva = 0.12;

     public Cuenta() {

    }
    public Cuenta(String n, ArrayList<Menu> listam,double stotal) {
nombreCliente = n;
listamenu = listam;
subtotal = stotal;
    }

    public void establecerNombre(String n) {
        nombreCliente = n;
    }

    public void establecerListadodeCartas(ArrayList<Menu> listam) {
        listamenu = listam;
    }

    public void establecerSubtotal(double stotal) {
        subtotal = stotal;
    }

    public void calcularvalorcancelartotal() {
        for (int i = 0; i < listamenu.size(); i++) {
            subtotal = subtotal + listamenu.get(i).obtenerValorMenu();

        }
        iva = subtotal * iva;
        valorCancelar = subtotal + iva;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public ArrayList<Menu> obtenerListadodeCartas() {
        return listamenu;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Cuenta\n"
                + "Nombre cliente:%s\n"
                + "-------------------------------------------------------------\n", obtenerNombreCliente());
        for (int i = 0; i < obtenerListadodeCartas().size(); i++) {
            cadena = String.format("%s"
                    + "%d "
                    + "%s\n",
                    cadena,
                    (i + 1),
                    obtenerListadodeCartas().get(i));

        }
        cadena = String.format("\n%s"
                + "Subtotal:%.2f\n"
                + "Iva:%.2f\n"
                + "Total a pagar:%.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelar());
        return cadena;
    }

}
