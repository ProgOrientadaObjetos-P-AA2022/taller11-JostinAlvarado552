/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author josti
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorinicialMenu;

    public Menu(String nP, double vinicialM) {
        nombrePlato = nP;

        valorinicialMenu = vinicialM;
    }

    public void establecerNombrePlato(String nP) {
        nombrePlato = nombrePlato;
    }

    public void establecerValorMenu(double vMenu) {
        valorMenu = vMenu;
    }

    public void establecerValorinicialMenu(double vinicialM) {
        valorinicialMenu = vinicialM;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorinicialMenu() {
        return valorinicialMenu;
    }

    public abstract void calcularvalorcancelartotal();

    @Override
    public String toString() {
        String cadena = String.format("\t\tNombre Plato:%s\n"
                + "\t\tValor menu inicial:%.2f\n", obtenerNombrePlato(),
                obtenerValorinicialMenu());
        return cadena;
    }

}
