/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author josti
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nP, double vinicialM) {
        super(nP, vinicialM);
        
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double pD) {
        porcentajeDescuento = ((pD * valorinicialMenu)) / 100;
    }

    @Override
    public void  calcularvalorcancelartotal() {
        valorMenu = valorinicialMenu - porcentajeDescuento;
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico\n%s", super.toString());
        cadena = String.format("%s"
                + "\t\tPorcentaje descuento: %.2f\n"
                + "\t\tValor Menu: %.2f\n"
                + "-------------------------------------------------------------\n", cadena,
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }

}
