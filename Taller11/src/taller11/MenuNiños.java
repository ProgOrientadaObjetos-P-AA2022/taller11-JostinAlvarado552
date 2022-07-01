/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author josti
 */
public class MenuNiños extends Menu {

    private double valorPorcionHelada;
    private double valorPorcionPastel;

    public MenuNiños(String nP, double vinicialM) {
        super(nP, vinicialM);
    }

    public void establecerValorPorcionHelada(double vph) {
        this.valorPorcionHelada = vph;
    }

    public void establecerValorPorcionPastel(double vpp) {
        this.valorPorcionPastel = vpp;
    }

    public double obtenerValorPorcionHelada() {
        return valorPorcionHelada;
    }

    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }

    @Override
    public void calcularvalorcancelartotal() {
        valorMenu = valorinicialMenu + valorPorcionHelada + valorPorcionPastel;
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu de Niños\n%s", super.toString());
        cadena = String.format("%s"
                + "\t\tValor Porcion Helado:%.2f\n"
                + "\t\tValor Porcion Pastel:%.2f\n"
                + "\t\tValor Menu:%.2f\n"
                + "-------------------------------------------------------------\n", cadena,
                obtenerValorPorcionHelada(),
                obtenerValorPorcionPastel(),
                obtenerValorMenu()
        );
        return cadena;
    }

}
