/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author josti
 */
public class MenuCarta extends Menu {

    private double valorporciondeGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;//en relacion del valor inicial del menu

    public MenuCarta(String nP, double vinicialM) {
        super(nP, vinicialM);
    }

    public void establecerValorporciondeGuarnicion(double vPG) {
        valorporciondeGuarnicion = vPG;
    }

    public void establecerValorBebida(double vBebida) {
        valorBebida = vBebida;
    }

    public void establecerPorcentajeAdicional(double pA) {
        porcentajeAdicional = ((pA * valorinicialMenu)) / 100;
    }

    public double obtenerValorporciondeGuarnicion() {
        return valorporciondeGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void calcularvalorcancelartotal() {
        valorMenu = (valorinicialMenu + valorporciondeGuarnicion + valorBebida) + porcentajeAdicional;

    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la carta\n%s", super.toString());
        cadena = String.format("%s"
                + "\t\tValor porcion guarnicion: %.2f\n"
                + "\t\tValor bebida: %.2f\n"
                + "\t\tPorcentaje Adicional: %.2f\n"
                + "\t\tValor menu: %.2f\n"
                + "-------------------------------------------------------------\n", 
                cadena,
                obtenerValorporciondeGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());
        return cadena;
    }

}
